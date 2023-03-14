
package DoAnQLSV.DAO;

import DoAnQLSV.BLL.LoginBLL;
import DoAnQLSV.DTO.DiemDTO;
import DoAnQLSV.DTO.LopDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DiemDAO {
    
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
        public static String message = null;
    
    private ArrayList<DiemDTO> diemList;
    private ArrayList<LopDTO> lopList;
    public DiemDAO(){
        diemList = new ArrayList<DiemDTO>();
        lopList = new ArrayList<LopDTO>();
    }
    
    public  ArrayList<DiemDTO> layDanhSachDiem()
    {
        setDiemList(new ArrayList<DiemDTO>());
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");  
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MSSV,MaMon,DiemQuaTrinh,DiemThi,DiemTongKet,DiemChu,MaHocKy FROM Diem");
            while(rs.next()){
                DiemDTO diemDTO = new DiemDTO();
                diemDTO.setMSSV(rs.getString(1));
                diemDTO.setMaMon(rs.getString(2));
                diemDTO.setDiemQuaTrinh(rs.getFloat(3));
                diemDTO.setDiemThi(rs.getFloat(4));
                diemDTO.setDiemTongKet(rs.getFloat(5));
                diemDTO.setDiemChu(rs.getString(6));
                diemDTO.setMaHocKi(rs.getString(7));      
                getDiemList().add(diemDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return this.getDiemList();
    }
        public  ArrayList<DiemDTO> laydiemtheoMSSV()
    {
        setDiemList(new ArrayList<DiemDTO>());
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MSSV,MaMon,DiemQuaTrinh,DiemThi,DiemTongKet,DiemChu,MaHocKy FROM Diem WHERE MSSV='"+LoginBLL.ID+"'");
            while(rs.next()){
                DiemDTO diemDTO = new DiemDTO();
                diemDTO.setMSSV(rs.getString(1));
                diemDTO.setMaMon(rs.getString(2));
                diemDTO.setDiemQuaTrinh(rs.getFloat(3));
                diemDTO.setDiemThi(rs.getFloat(4));
                diemDTO.setDiemTongKet(rs.getFloat(5));
                diemDTO.setDiemChu(rs.getString(6));
                diemDTO.setMaHocKi(rs.getString(7));      
                getDiemList().add(diemDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return this.getDiemList();
    }
    public  ArrayList<DiemDTO> layDiemTBTheoSV()
    {
        setDiemList(new ArrayList<DiemDTO>());
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery(
                                            "SELECT MSSV,Avg(DiemTongKet) as DTB "
                                            + "FROM Diem "
                                            + "Group By MSSV"
                                         //   + "Order By DTB desc"
                                            );
            while(rs.next()){
                DiemDTO diemDTO = new DiemDTO();
                diemDTO.setMSSV(rs.getString(1));
                diemDTO.setDTB(rs.getFloat(2));

                getDiemList().add(diemDTO);
            }
            conn.close();
        }catch (Exception e) {

        }

    return this.getDiemList();
    }
    public void themDiem(DiemDTO diem){
        try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="INSERT INTO Diem (MSSV,MaMon,DiemQuaTrinh,DiemThi,DiemTongKet,DiemChu,MaHocKy)  VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, diem.getMSSV());
            stmt.setString(2, diem.getMaMon());
            stmt.setFloat(3, diem.getDiemQuaTrinh());
            stmt.setFloat(4, diem.getDiemThi());
            stmt.setFloat(5, diem.tinhDiemTongKet());
            stmt.setString(6, diem.tinhDiemChu());
            stmt.setString(7, diem.getMaHocKi());

            stmt.executeUpdate();
            stmt.close();
            con.close();
            
            message = "Thêm Điểm SV"+ diem.getMSSV()+"môn học "+ diem.getMaMon()+"thành công";
        } catch (Exception e) {
            System.out.println(e);
            String temp = e.toString();
            if(temp.contains("Violation of PRIMARY KEY constraint 'PK_Diem'")){
                message = "Thất bại !Sinh viên đã có điểm môn học : "+diem.getMaMon();
            }
            if(temp.contains("The INSERT statement conflicted with the FOREIGN KEY constraint")){
                message = "Thất bại ! MSSV này chưa có sinh viên";
            }
        }
    }
    public void suaDiem(DiemDTO diem)
    {
        try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
        String query = "UPDATE Diem SET MSSV='"+diem.getMSSV()+"', MaMon='"+diem.getMaMon()+"', DiemQuaTrinh ='"+diem.getDiemQuaTrinh()+"' , DiemThi='"+diem.getDiemThi()+"',DiemTongKet='"+diem.tinhDiemTongKet()+"'"
                + ",DiemChu='"+diem.tinhDiemChu()+"',MaHocKy='"+diem.getMaHocKi()+"' WHERE MSSV ='"+diem.getMSSV()+"' and MaMon ='"+diem.getMaMon()+"'";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        con.close();
            message = "Sửa Điểm SV"+ diem.getMSSV()+"môn học "+ diem.getMaMon()+"thành công";
        } catch (Exception e) {
                        System.out.println(e);
            message = "Thất bại ! Trùng mã điểm của SV";
            }
    }
    public void xoaDiem (DiemDTO diem)
    {
        try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
        String query ="    DELETE FROM  Diem WHERE MSSV ='"+diem.getMSSV()+"' and MaMon ='"+diem.getMaMon()+"'" ;
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        con.close();

            message = "Xóa Điểm SV"+ diem.getMSSV()+"môn học "+ diem.getMaMon()+"thành công";
        } catch (Exception e) {
            message = "Thất bại !";
            }

    }
    /**
     * @return the diemList
     */
    public ArrayList<DiemDTO> getDiemList() {
        return diemList;
    }
    public ArrayList<LopDTO> getLopList() {
        return lopList;
    }
    /**
     * @param diemList the diemList to set
     */
    public void setDiemList(ArrayList<DiemDTO> diemList) {
        this.diemList = diemList;
    }
}
