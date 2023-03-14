
package DoAnQLSV.DAO;

import java.sql.*;


public class LoginDAO {
    public static Connection getConnect()
    {
        try {

            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            return conn;
        }catch (Exception e) {
            return null;
        }

    }
}
