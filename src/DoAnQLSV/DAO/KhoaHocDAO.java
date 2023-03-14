/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnQLSV.DAO;

import DoAnQLSV.DTO.KhoaHocDTO;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author kshin
 */
public class KhoaHocDAO {
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;encrypt=true;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String pass = "sa";
    private ArrayList<KhoaHocDTO> khoaHocList;
    public KhoaHocDAO(){
        khoaHocList = new ArrayList<KhoaHocDTO>();
    }
    public  ArrayList<KhoaHocDTO> layDanhSachKhoaHoc()
    {
         khoaHocList = new ArrayList<KhoaHocDTO>();
        try {
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLSV_Java;useUnicode=yes&characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true","sa","sa");  
            Statement pst = conn.createStatement();
            ResultSet rs = pst.executeQuery("SELECT MaKhoaHoc,TenKhoaHoc FROM KhoaHoc");
            while(rs.next()){
                KhoaHocDTO khoahocDTO = new KhoaHocDTO();
                khoahocDTO.setMaKhoaHoc(rs.getString(1));
                khoahocDTO.setTenKhoaHoc(rs.getString(2));       
                khoaHocList.add(khoahocDTO);
            }
            conn.close();
        }catch (Exception e) {

        }
    return khoaHocList;
    }
     public ArrayList<KhoaHocDTO> getKhoaHocList() {
        return khoaHocList;
    }
       public void setKhoaHocList(ArrayList<KhoaHocDTO> khoaHocList) {
        this.khoaHocList = khoaHocList;
    }
}
