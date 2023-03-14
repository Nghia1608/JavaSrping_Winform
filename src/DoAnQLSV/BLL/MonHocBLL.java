
package DoAnQLSV.BLL;



import DoAnQLSV.DAO.*;
import DoAnQLSV.DTO.MonHocDTO;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MonHocBLL {
    private ArrayList<MonHocDTO>  monhocList;
    private MonHocDAO monhocDAO;
    public static String message = null;
    
    
    public MonHocBLL()
    {
        monhocList = new ArrayList<MonHocDTO>();
        monhocDAO = new MonHocDAO();
    }
  public void  themMonHoc(MonHocDTO monhoc)
    {
        monhocDAO.ThemMonHoc(monhoc);
        message = MonHocDAO.message;
    }
     public void  suaMonHoc(MonHocDTO monhoc)
    {
        monhocDAO.suaMonHoc(monhoc);        message = MonHocDAO.message;
    }
     public void  xoaMonHoc(MonHocDTO monhoc)
    {
        monhocDAO.xoaMonHoc(monhoc);        message = MonHocDAO.message;
    }
    public void Timkiem(MonHocDTO mh, JTable tb)
   {
       monhocDAO.Timkiem(mh, tb);
    }
    public ArrayList<MonHocDTO> laydanhsachMonHoc(){
        this.monhocList = monhocDAO.layDanhSachMonHoc();
        return this.monhocList;        
    }
    public void hienThiDanhSachMonHoc(JTable tbl){
        monhocDAO.layDanhSachMonHoc();
        DefaultTableModel svTable = (DefaultTableModel) tbl.getModel();
        svTable.setRowCount(0);         // them thi chi hien sv moi..k hien sql
        Object rowSV[] = new Object[4];
        for (int i = 0; i < monhocList.size() ; i++){
            rowSV [0] = monhocList.get(i).getMaMon();
            rowSV [1] = monhocList.get(i).getTenMon();
            rowSV [2] = monhocList.get(i).getSoTiet();
            rowSV [3] = monhocList.get(i).getSoTinChi();
            svTable.addRow(rowSV);        
            }
    }
}

