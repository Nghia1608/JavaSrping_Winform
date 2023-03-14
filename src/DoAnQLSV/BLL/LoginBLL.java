
package DoAnQLSV.BLL;

import DoAnQLSV.DAO.LoginDAO;
import java.sql.*;


public class LoginBLL {
    public static Connection conn = null;    
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static String quyen = null;
    public static String ID;
    public static String testConnect() {
        try
        {
            conn = LoginDAO.getConnect();
            return "Ket noi thanh cong";
        }
        catch(Exception e)
        {
            return "Ket noi that bai";
        }
        
    }
    public static ResultSet cLog(String user,String pass,String quyenAC)
    {
        String sql="select * from TaiKhoan where ID=? and Password=? and Quyen=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,user);
            pst.setString(2,pass);
            pst.setString(3,quyenAC);
            quyen = quyenAC; 
            ID=user;
            return rs=pst.executeQuery();                        
        } catch (Exception e) {
            return rs=null;
        }
    }
        public static ResultSet bLog(String user,String gmail,String quyenAC)
    {
        String sql="select * from TaiKhoan where ID=? and Gmail=? and Quyen=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,user);
            pst.setString(2,gmail);
            pst.setString(3,quyenAC);
            quyen = quyenAC; 
            ID=user;
            return rs=pst.executeQuery();                        
        } catch (Exception e) {
            return rs=null;
        }
    }
}
