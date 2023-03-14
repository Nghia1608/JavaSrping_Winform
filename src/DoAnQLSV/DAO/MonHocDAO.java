
package DoAnQLSV.DAO;

import DoAnQLSV.DTO.MonHocDTO;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class MonHocDAO {
    
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
        
        public static String message = null;
    
    private ArrayList<MonHocDTO> monhocList;
    public MonHocDAO(){
        monhocList = new ArrayList<MonHocDTO>();
    }
    
    public  ArrayList<MonHocDTO> layDanhSachMonHoc()
    {
        monhocList = new ArrayList<MonHocDTO>();
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");  
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MaMon,TenMon,SoTiet,SoTinChi FROM MonHoc");
            while(rs.next()){
                MonHocDTO monhocDTO = new MonHocDTO();
                monhocDTO.setMaMon(rs.getString(1));
                monhocDTO.setTenMon(rs.getString(2));       
                monhocDTO.setSoTiet(rs.getInt(3));            
                monhocDTO.setSoTinChi(rs.getInt(4));      
                getMonHocList().add(monhocDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return this.getMonHocList();
    }
    public void ThemMonHoc(MonHocDTO monhoc){
        try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="INSERT INTO MonHoc (MaMon,TenMon,SoTiet,SoTinChi)  VALUES(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, monhoc.getMaMon());
            stmt.setString(2, monhoc.getTenMon());
            stmt.setInt(3, monhoc.getSoTiet());
            stmt.setInt(4, monhoc.getSoTinChi());           
            stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Thêm môn "+ monhoc.getMaMon()+" thành công";
        } catch (Exception e) {
            message = "Thất bại ! Trùng Mã môn "+ monhoc.getMaMon()+"";
        }
        }
     public void suaMonHoc(MonHocDTO monhoc)
    {
           try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
            String query ="UPDATE MonHoc SET MaMon= '"+monhoc.getMaMon()+"', TenMon=N'"+monhoc.getTenMon()+"', SoTiet='"+monhoc.getSoTiet()+"', SoTinChi='"+monhoc.getSoTinChi()+"' WHERE MaMon = '"+monhoc.getMaMon()+"'";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Sửa môn "+ monhoc.getMaMon()+" thành công";
        } catch (Exception e) {
            message = "Thất bại !";
        }

    }
      public void xoaMonHoc (MonHocDTO monhoc)
        {
               try {
            Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");
                    String query ="    DELETE FROM  MonHoc WHERE MaMon ='"+monhoc.getMaMon()+"'";
                 PreparedStatement stmt = con.prepareStatement(query);
             stmt.executeUpdate();
            stmt.close();
            con.close();
            message = "Xóa môn "+ monhoc.getMaMon()+" thành công";
        } catch (Exception e) {
            message = "Thất bại !Môn học "+ monhoc.getMaMon()+" được sử dụng ở bảng khác";
        }
        }
      public void Timkiem(MonHocDTO mh, JTable tb)
         {
             try {
                 Connection con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true","sa","sa");
                 String query = "SELECT * FROM MonHoc WHERE MaMon like'%" +mh.getMaMon()+"%' or TenMon like'%"+mh.getTenMon()+"%'";
                  PreparedStatement stmt = con.prepareStatement(query);
                
                 stmt.executeQuery();
                   tb.setModel((DbUtils.resultSetToTableModel(stmt.executeQuery())));
                 stmt.close();
                 con.close();
             } catch (Exception e) {
             }
         }
    /**
     * @return the monhocList
     */
    public ArrayList<MonHocDTO> getMonHocList() {
        return monhocList;
    }

    /**
     * @param monhocList the monhocList to set
     */
    public void setMonHocList(ArrayList<MonHocDTO> monhocList) {
        this.monhocList = monhocList;
    }

    
}
