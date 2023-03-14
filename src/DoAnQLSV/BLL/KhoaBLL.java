
package DoAnQLSV.BLL;


import DoAnQLSV.DAO.*;
import DoAnQLSV.DTO.KhoaDTO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class KhoaBLL {
    private ArrayList<KhoaDTO>  khoaList;
    private KhoaDAO khoaDAO;
        public static String message = null;
    
    public KhoaBLL()
    {
        khoaList = new ArrayList<KhoaDTO>();
        khoaDAO = new KhoaDAO();
    }
  public void  themKhoa(KhoaDTO khoa)
    {
        khoaDAO.ThemKhoa(khoa);
        message = khoaDAO.message;
    }
     public void  suaKhoa(KhoaDTO khoa)
    {
        khoaDAO.suaKhoa(khoa);
        message = khoaDAO.message;
    }
     public void  xoaKhoa(KhoaDTO khoa)
    {
        khoaDAO.xoaKhoa(khoa);
        message = khoaDAO.message;
    }
    
    public ArrayList<KhoaDTO> laydanhsachKhoa(){
        this.khoaList = khoaDAO.layDanhSachKhoa();
        return this.khoaList;
        
    }
    public void hienThiDanhSachKhoa(JTable tbl){
        DefaultTableModel svTable = (DefaultTableModel) tbl.getModel();
        svTable.setRowCount(0);         // them thi chi hien sv moi..k hien sql
        Object rowSV[] = new Object[2];
        for (int i = 0; i < khoaList.size() ; i++){
            rowSV [0] = khoaList.get(i).getMaKhoa();
            rowSV [1] = khoaList.get(i).getTenKhoa();
            svTable.addRow(rowSV);     
            }
    }
    public void LoadCBBMaKhoa(JComboBox cbb)
    {
        khoaDAO.layDanhSachKhoa();
        DefaultComboBoxModel lopCBB =  (DefaultComboBoxModel) cbb.getModel();
        for (int i = 0; i < khoaList.size() ; i++){      
            lopCBB.addElement(khoaList.get(i).getMaKhoa());            
            }
    }
        public void Timkiem (KhoaDTO k, JTable tb)
     {
         khoaDAO.Timkiem(k, tb);
     }

}

