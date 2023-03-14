
package DoAnQLSV.DAO;

import DoAnQLSV.DTO.HocKiDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class HocKiDAO {
    
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
        public static String message = null;
    
    private ArrayList<HocKiDTO> hockiList;
    public HocKiDAO(){
        hockiList = new ArrayList<HocKiDTO>();
    }
    
    public  ArrayList<HocKiDTO> layDanhSachHocKi()
    {
        setHockiList(new ArrayList<HocKiDTO>());
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true","sa","sa");    
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MaHocKy,TenHocKy FROM HocKy");
            while(rs.next()){
                HocKiDTO hockiDTO = new HocKiDTO();
                hockiDTO.setMaHocKy(rs.getString(1));
                hockiDTO.setTenHocKy(rs.getString(2));       
                getHockiList().add(hockiDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return getHockiList();
    }

    /**
     * @return the hockiList
     */
    public ArrayList<HocKiDTO> getHockiList() {
        return hockiList;
    }

    /**
     * @param hockiList the hockiList to set
     */
    public void setHockiList(ArrayList<HocKiDTO> hockiList) {
        this.hockiList = hockiList;
    }

}