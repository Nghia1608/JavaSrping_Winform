
package DoAnQLSV.DAO;

import DoAnQLSV.BLL.LoginBLL;
import DoAnQLSV.DTO.KhoaDTO;
import DoAnQLSV.DTO.LopDTO;
import DoAnQLSV.DTO.SinhVienDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class SinhVienDAO {
    
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
    
    public static String message = null;
    
    private ArrayList<SinhVienDTO> svList;
    public SinhVienDAO(){
        svList = new ArrayList<SinhVienDTO>();
    }
    
    public  ArrayList<SinhVienDTO> layDanhSachSV()
    {
        svList = new ArrayList<SinhVienDTO>();
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");  
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MSSV,Ho,Ten,CCCD,DanToc,GioiTinh,NamSinh,SDT,Email,MaLop,TrangThai FROM SinhVien");
            while(rs.next()){
                SinhVienDTO svDTO = new SinhVienDTO();
                svDTO.setMSSV(rs.getString(1));
                svDTO.setHo(rs.getString(2));
                svDTO.setTen(rs.getString(3));
                svDTO.setCCCD(rs.getString(4));
                svDTO.setDanToc(rs.getString(5));
                svDTO.setGioiTinh(rs.getString(6));
                svDTO.setNgaySinh(rs.getString(7));
                svDTO.setSDT(rs.getString(8));
                svDTO.setEmail(rs.getString(9));
                svDTO.setMaLop(rs.getString(10));
                svDTO.setTrangThai(rs.getString(11));         
                getSvList().add(svDTO);
            }
            conn.close();
        }catch (Exception e) {
        }
    return this.getSvList();
    }
    public  ArrayList<SinhVienDTO> laySVTheoMa()
    {
        svList = new ArrayList<SinhVienDTO>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=true;characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");    
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MSSV,Ho,Ten,CCCD,DanToc,GioiTinh,NamSinh,SDT,Email,MaLop,TrangThai FROM SinhVien WHERE MSSV='"+LoginBLL.ID+"'");
            while(rs.next()){
                SinhVienDTO svDTO = new SinhVienDTO();
                svDTO.setMSSV(rs.getString(1));
                svDTO.setHo(rs.getString(2));
                svDTO.setTen(rs.getString(3));
                svDTO.setCCCD(rs.getString(4));
                svDTO.setDanToc(rs.getString(5));
                svDTO.setGioiTinh(rs.getString(6));
                svDTO.setNgaySinh(rs.getString(7));
                svDTO.setSDT(rs.getString(8));
                svDTO.setEmail(rs.getString(9));
                svDTO.setMaLop(rs.getString(10));
                svDTO.setTrangThai(rs.getString(11));         
                getSvList().add(svDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return this.getSvList();
    }    
        public void ThemSinhVien(SinhVienDTO sv){
        try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="INSERT INTO SinhVien (MSSV,Ho,Ten,CCCD,DanToc,GioiTinh,NamSinh,SDT,Email,MaLop,TrangThai)  VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, sv.getMSSV());
            stmt.setString(2, sv.getHo());
            stmt.setString(3, sv.getTen());
            stmt.setString(4, sv.getCCCD());
            stmt.setString(5, sv.getDanToc());
            stmt.setString(6, sv.getGioiTinh());
            stmt.setString(7, sv.getNgaySinh());
            stmt.setString(8, sv.getSDT());
            stmt.setString(9, sv.getEmail());
            stmt.setString(10, sv.getMaLop());
            stmt.setString(11, sv.getTrangThai());
            stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Thêm SV"+ sv.getMSSV()+"thành công";
        } catch (Exception e) {
            message = "Thất bại ! Trùng MSSV";
        }
        }
        public void suaSinhVien(SinhVienDTO sv)
        {
            
            try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query = "UPDATE SinhVien SET MSSV='"+sv.getMSSV()+"', Ho=N'"+sv.getHo()+"', Ten =N'"+sv.getTen()+"' , CCCD='"+sv.getCCCD()+"',DanToc=N'"+sv.getDanToc()+"'"
                    + ",GioiTinh=N'"+sv.getGioiTinh()+"',NamSinh='"+sv.getNgaySinh()+"',SDT='"+sv.getSDT()+"',Email='"+sv.getEmail()+"',MaLop='"+sv.getMaLop()+"',TrangThai=N'"+sv.getTrangThai()+"' "
                    + "     WHERE MSSV='"+sv.getMSSV()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Sửa SV"+ sv.getMSSV()+"thành công";
            } catch (Exception e) {
                System.out.println(e);
            }


        }
        public void xoaSinhVien (SinhVienDTO sv)
        {
            try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="    DELETE FROM  SinhVien WHERE MSSV ='"+sv.getMSSV()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Xóa SV"+ sv.getMSSV()+"thành công";
            } catch (Exception e) {
            message = "Xóa thất bại !"+ sv.getMSSV()+" được sử dụng ở bảng khác.";
            }

        }
         public void Timkiem(SinhVienDTO sv, JTable tb)
         {
             try {
                 Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true","sa","sa");
                 String query = "SELECT * FROM SinhVien WHERE MSSV like'%" +sv.getMSSV()+"%' or Ten like'%"+sv.getTen()+"%' or Ho like'%"+sv.getHo()+"%'";
                  PreparedStatement stmt = con.prepareStatement(query);
                
                 stmt.executeQuery();
                   tb.setModel((DbUtils.resultSetToTableModel(stmt.executeQuery())));
                 stmt.close();
                 con.close();
             } catch (Exception e) {
             }
         }
         public void Timkiem1(SinhVienDTO sv, LopDTO lop, KhoaDTO k, JTable tb)
         {
             
             try {
                 Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true","sa","sa");                 
                 String query = "SELECT MSSV,SinhVien.Ho,SinhVien.Ten,SinhVien.NamSinh,SinhVien.GioiTinh,Lop.MaKhoa,SinhVien.MaLop "
              + "FROM Lop,Khoa,SinhVien "
               + "WHERE Lop.MaKhoa=Khoa.MaKhoa and Lop.MaLop = SinhVien.MaLop "
                + "and SinhVien.MSSV like'%" +sv.getMSSV()+"%'"
                + "and SinhVien.Ho like'%" +sv.getHo()+"%'"
               + "and SinhVien.Ten like'%" +sv.getTen()+"%'"
                + "and SinhVien.MaLop like'%" +lop.getMaLop()+"%'"
                 + "and Khoa.MaKhoa like'%" +k.getMaKhoa()+"%'";

                  PreparedStatement stmt = con.prepareStatement(query);
                
                 stmt.executeQuery();
                   tb.setModel((DbUtils.resultSetToTableModel(stmt.executeQuery())));
                 stmt.close();
                 con.close();
             } catch (Exception e) {
                 System.out.println(e);
                 
             }
         }
    public ArrayList<SinhVienDTO> getSvList() {
        return svList;
    }

    public void setSvList(ArrayList<SinhVienDTO> svList) {
        this.svList = svList;
    }
    
}
