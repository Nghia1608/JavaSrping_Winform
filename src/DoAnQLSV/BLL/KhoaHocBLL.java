/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnQLSV.BLL;

import DoAnQLSV.DAO.KhoaHocDAO;
import DoAnQLSV.DTO.KhoaHocDTO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshin
 */
public class KhoaHocBLL {
     private ArrayList<KhoaHocDTO>  khoaHocList;
    private KhoaHocDAO khoaHocDAO;
    public KhoaHocBLL()
    {
        khoaHocList = new ArrayList<KhoaHocDTO>();
        khoaHocDAO = new KhoaHocDAO();
    }
     public ArrayList<KhoaHocDTO> laydanhsachKhoaHoc(){
        this.khoaHocList = khoaHocDAO.layDanhSachKhoaHoc();
        return this.khoaHocDAO.getKhoaHocList();

    }     
    
    public void hienThiDanhSachKhoaHoc(JTable tbl){
        DefaultTableModel svTable = (DefaultTableModel) tbl.getModel();
        svTable.setRowCount(0);         // them thi chi hien sv moi..k hien sql
        Object rowSV[] = new Object[11];
        for (int i = 0; i < khoaHocList.size() ; i++){
            rowSV [1] = khoaHocList.get(i).getTenKhoaHoc();
            svTable.addRow(rowSV);
            
            
            }
    }
        public void LoadCBBMaKhoaHoc(JComboBox cbb)
    {
        khoaHocDAO.layDanhSachKhoaHoc();
        DefaultComboBoxModel Khoacbb =  (DefaultComboBoxModel) cbb.getModel();
        for (int i = 0; i < khoaHocList.size() ; i++){      
            Khoacbb.addElement(khoaHocList.get(i).getMaKhoaHoc());            
            }
    }
}
