
package DoAnQLSV.DAO;


import DoAnQLSV.DTO.LopDTO;
import DoAnQLSV.GUI.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class LopDAO {
    
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
    public static String message = null;
        
    private ArrayList<LopDTO> lopList;
    public LopDAO(){
        lopList = new ArrayList<LopDTO>();
    }
    
    public  ArrayList<LopDTO> layDanhSachLop()
    {
        lopList = new ArrayList<LopDTO>();
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");   
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MaLop,TenLop,SiSo,MaKhoaHoc,MaKhoa FROM Lop");
            while(rs.next()){
                LopDTO lopDTO = new LopDTO();
                lopDTO.setMaLop(rs.getString(1));
                lopDTO.setTenLop(rs.getString(2));       
                lopDTO.setSiSo(rs.getInt(3));   
                lopDTO.setMaKhoaHoc(rs.getString(4));   
                lopDTO.setMaKhoa(rs.getString(5));                   
                getLopList().add(lopDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return this.getLopList();
    }

     public void ThemLop(LopDTO lop){
        try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="INSERT INTO Lop (MaLop,TenLop,SiSo,MaKhoaHoc,MaKhoa)  VALUES(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, lop.getMaLop());
             stmt.setString(2, lop.getTenLop());
             stmt.setInt(3, lop.getSiSo());
             stmt.setString(4, lop.getMaKhoaHoc());
             stmt.setString(5, lop.getMaKhoa());
             stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Thêm lớp"+ lop.getMaLop()+"thành công";
        } catch (Exception e) {
            message = "Thất bại ! Trùng mã lớp";
        }
        }
         public void suaLop(LopDTO lop)
        {
            
            try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
              String query = "UPDATE Lop SET MaLop='"+lop.getMaLop()+"', TenLop=N'"+lop.getTenLop()+"', SiSo ='"+lop.getSiSo()+"' , MaKhoaHoc='"+lop.getMaKhoaHoc()+"',MaKhoa='"+lop.getMaKhoa()+"' WHERE MaLop='"+lop.getMaLop()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
             stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Sửa lớp "+ lop.getMaLop()+"thành công";
        } catch (Exception e) {
            message = "Thất bại ! Trùng mã lớp";
           
        }
        }
         public void xoaLop (LopDTO lop)
        {
               try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
                    String query ="    DELETE FROM  Lop WHERE MaLop ='"+lop.getMaLop()+"'";
                 PreparedStatement stmt = con.prepareStatement(query);
             stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Xóa lớp"+ lop.getMaLop()+"thành công";
        } catch (Exception e) {
            message = "Xóa lớp thất bại ! Lớp "+ lop.getMaLop()+" được sử dụng ở bảng khác";
        }
               
        }
          public static ResultSet ShowTextField(String query)
    {
        try
            {
                Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true","sa","sa");
                PreparedStatement stmt =con.prepareStatement(query);
                return stmt.executeQuery();
            }
        catch(Exception e)
            {
                return null;

            }
    }
         public void Timkiem(LopDTO lop, JTable tb)
         {
             try {
                 Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true","sa","sa");
                 String query = "SELECT * FROM Lop WHERE MaLop like'%" +lop.getMaLop()+"%' or TenLop like'%"+lop.getTenLop()+"%'";
                PreparedStatement stmt = con.prepareStatement(query);
                
                 stmt.executeQuery();
                   tb.setModel((DbUtils.resultSetToTableModel(stmt.executeQuery())));
                 stmt.close();
                 con.close();
             } catch (Exception e) {
             }
         }

    /**
     * @return the lopList
     */
    public ArrayList<LopDTO> getLopList() {
        return lopList;
    }

    /**
     * @param lopList the lopList to set
     */
    public void setLopList(ArrayList<LopDTO> lopList) {
        this.lopList = lopList;
    }

    
}
