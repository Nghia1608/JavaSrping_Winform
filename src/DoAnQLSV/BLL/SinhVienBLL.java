
package DoAnQLSV.BLL;


import DoAnQLSV.DTO.*;
import DoAnQLSV.DAO.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SinhVienBLL {
    private ArrayList<SinhVienDTO>  svList;
    private SinhVienDAO svDAO;
    public static String message = null;
    
    public SinhVienBLL()
    {
        svList = new ArrayList<SinhVienDTO>();
        svDAO = new SinhVienDAO();
    }
    public void  themSinhVien(SinhVienDTO sv)
    {
        svDAO.ThemSinhVien(sv);
        message = SinhVienDAO.message;
    }
    
    public void suaSinhVien(SinhVienDTO sv)
    {
        svDAO.suaSinhVien(sv);
                message = SinhVienDAO.message;
    }
    public void xoaSinhVien(SinhVienDTO sv)
    {
        svDAO.xoaSinhVien(sv);
                message = SinhVienDAO.message;
    }
    public ArrayList<SinhVienDTO> laydanhsachSV(){
        this.svList = svDAO.layDanhSachSV();
        return this.svDAO.getSvList();        
    }
    public void Timkiem (SinhVienDTO sv, JTable tb)
    {
        svDAO.Timkiem(sv, tb);
    }
    public void Timkiem1(SinhVienDTO sv, LopDTO lop, KhoaDTO k, JTable tb)
         {
            svDAO.Timkiem1(sv, lop, k, tb);
         }
    public void hienThiDanhSachSV(JTable tbl){
        svDAO.layDanhSachSV();
        DefaultTableModel svTable = (DefaultTableModel) tbl.getModel();
        svTable.setRowCount(0);         
        Object rowSV[] = new Object[11];
        for (int i = 0; i < svList.size() ; i++){
            rowSV [0] = svList.get(i).getMSSV();
            rowSV [1] = svList.get(i).getHo();
            rowSV [2] = svList.get(i).getTen();
            rowSV [3] = svList.get(i).getCCCD();
            rowSV [4] = svList.get(i).getDanToc();
            rowSV [5] = svList.get(i).getGioiTinh();
            rowSV [6] = svList.get(i).getNgaySinh();
            rowSV [7] = svList.get(i).getSDT();
            rowSV [8] = svList.get(i).getEmail();
            rowSV [9] = svList.get(i).getMaLop();
            rowSV [10] = svList.get(i).getTrangThai();
            svTable.addRow(rowSV);
         }
    }
        public ArrayList<SinhVienDTO> laysinhvientheoma(){
        this.svList = svDAO.laySVTheoMa();
        return this.svDAO.getSvList();        
    }
    
    public void hienthisinhvien(JTable tbl){
        svDAO.laySVTheoMa();
        DefaultTableModel svTable = (DefaultTableModel) tbl.getModel();
        svTable.setRowCount(0);         
        Object rowSV[] = new Object[11];
        for (int i = 0; i < svList.size() ; i++){
            rowSV [0] = svList.get(i).getMSSV();
            rowSV [1] = svList.get(i).getHo();
            rowSV [2] = svList.get(i).getTen();
            rowSV [3] = svList.get(i).getCCCD();
            rowSV [4] = svList.get(i).getDanToc();
            rowSV [5] = svList.get(i).getGioiTinh();
            rowSV [6] = svList.get(i).getNgaySinh();
            rowSV [7] = svList.get(i).getSDT();
            rowSV [8] = svList.get(i).getEmail();
            rowSV [9] = svList.get(i).getMaLop();
            rowSV [10] = svList.get(i).getTrangThai();
            svTable.addRow(rowSV);
         }
    }
}

