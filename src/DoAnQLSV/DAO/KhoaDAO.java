
package DoAnQLSV.DAO;

import DoAnQLSV.DTO.KhoaDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class KhoaDAO {
    
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
    
        public static String message = null;
    
    public  ArrayList<KhoaDTO> layDanhSachKhoa()
    {
        ArrayList<KhoaDTO> khoaList = new ArrayList<KhoaDTO>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;characterEncoding=UTF-8;trustServerCertificate=true","sa","sa");    
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MaKhoa,TenKhoa FROM Khoa Order by MaKhoa");
            while(rs.next()){
                KhoaDTO khoaDTO = new KhoaDTO();
                khoaDTO.setMaKhoa(rs.getString(1));
                khoaDTO.setTenKhoa(rs.getString(2));       
                khoaList.add(khoaDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return khoaList;
    }
    public void ThemKhoa(KhoaDTO khoa){
        try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="INSERT INTO Khoa (MaKhoa,TenKhoa)  VALUES(?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, khoa.getMaKhoa());
             stmt.setString(2, khoa.getTenKhoa());
             stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Thêm khoa"+ khoa.getMaKhoa()+"thành công";
        } catch (Exception e) {
            message = "Thất bại! Trùng mã khoa";
            System.out.println(e);
        }
        }
     public void suaKhoa(KhoaDTO khoa)
    {
           try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="UPDATE Khoa SET MaKhoa= N'"+khoa.getMaKhoa()+"', TenKhoa=N'"+khoa.getTenKhoa()+"' WHERE MaKhoa = '"+khoa.getMaKhoa()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.executeUpdate();
            stmt.close();
            con.close();
                        message = "Sửa khoa"+ khoa.getMaKhoa()+"thành công";
            } catch (Exception e) {
                System.out.println(e);
            }

    }
      public void xoaKhoa (KhoaDTO khoa)
        {
            try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="    DELETE FROM  Khoa WHERE MaKhoa ='"+khoa.getMaKhoa()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Xóa khoa"+ khoa.getMaKhoa()+"thành công";
            } catch (Exception e) {
                System.out.println(e);
            message = "Xóa thất bại !"+ khoa.getMaKhoa()+" được sử dụng ở bảng khác.";    
            }

        }
    public void Timkiem(KhoaDTO k, JTable tb)
         {
             try {
                 Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true","sa","sa");
                 String query = "SELECT * FROM Khoa WHERE MaKhoa like'%" +k.getMaKhoa()+"%' or TenKhoa like'%"+k.getTenKhoa()+"%'";
                  PreparedStatement stmt = con.prepareStatement(query);
                
                 stmt.executeQuery();
                   tb.setModel((DbUtils.resultSetToTableModel(stmt.executeQuery())));
                 stmt.close();
                 con.close();
             } catch (Exception e) {
             }
         }
}