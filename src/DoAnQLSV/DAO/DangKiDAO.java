
package DoAnQLSV.DAO;

import static DoAnQLSV.DAO.SinhVienDAO.message;
import DoAnQLSV.DTO.DangKiDTO;

import java.sql.*;
import java.util.ArrayList;



public class DangKiDAO {
    
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
    public static String message = null;
    public  ArrayList<DangKiDTO> layDanhSachTaiKhoan()
    {
        ArrayList<DangKiDTO> taiKhoanList = new ArrayList<DangKiDTO>();
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT ID,MSSV,Gmail,Password,Confirm,Quyen FROM TaiKhoan");
            while(rs.next()){
                DangKiDTO dangKiDTO = new DangKiDTO();
                dangKiDTO.setID(rs.getString(1));
                dangKiDTO.setMSSV(rs.getString(2));  
                dangKiDTO.setGmail(rs.getString(3));  
                dangKiDTO.setPassword(rs.getString(4));  
                dangKiDTO.setCofirm(rs.getString(5));        
                dangKiDTO.setQuyen(rs.getString(6));  
                taiKhoanList.add(dangKiDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return taiKhoanList;
    }
    public void ThemTaiKhoan(DangKiDTO dangKiDTO){
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="INSERT INTO TaiKhoan (ID,MSSV,Gmail,Password,Cofirm,Quyen)  VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, dangKiDTO.getID());
            stmt.setString(2, dangKiDTO.getMSSV());
            stmt.setString(3, dangKiDTO.getGmail());
            stmt.setString(4, dangKiDTO.getPassword());
            stmt.setString(5, dangKiDTO.getCofirm());
            stmt.setString(6, dangKiDTO.getQuyen());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            message = "Thêm tài khoản"+ dangKiDTO.getMSSV()+"thành công";
            
        } catch (Exception e) {
            System.out.println(e);
            String temp = e.toString();
            if(temp.contains("The INSERT statement conflicted with the FOREIGN KEY")){
                message = "Thất bại !Chưa có sinh viên";
            }
            if(temp.contains("Violation of PRIMARY KEY")){
                message = "Thất bại !Trùng MSSV";
            }

        }
        }
    
    public void SuaTaiKhoan(DangKiDTO dangKiDTO){
            try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query = "UPDATE TaiKhoan SET ID='"+dangKiDTO.getMSSV()+"', MSSV='"+dangKiDTO.getMSSV()+"', Gmail =N'"+dangKiDTO.getGmail()+"' , Password='"+dangKiDTO.getPassword()+"',Cofirm='"+dangKiDTO.getCofirm()+"',Quyen=N'"+dangKiDTO.getQuyen()+"' "
                    + "     WHERE ID='"+dangKiDTO.getMSSV()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Quên mật khẩu tài khoản "+ dangKiDTO.getMSSV()+"thành công";
            } catch (Exception e) {
                System.out.println(e);
            }

}
    }