
package DoAnQLSV.BLL;


import DoAnQLSV.DTO.DiemDTO;
import DoAnQLSV.DAO.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DiemBLL {
    private ArrayList<DiemDTO>  diemList;
    private DiemDAO diemDAO;
        public static String message = null;
    
    public DiemBLL()
    {
        diemList = new ArrayList<DiemDTO>();
        diemDAO = new DiemDAO();
    }
    public void  themDiem(DiemDTO diem)
    {
        diemDAO.themDiem(diem);
        message = diemDAO.message;
    }
    
    public void suaDiem(DiemDTO diem)
    {
        diemDAO.suaDiem(diem);        message = diemDAO.message;
    }
    public void xoaDiem(DiemDTO diem)
    {
        diemDAO.xoaDiem(diem);        message = diemDAO.message;
    }
    public ArrayList<DiemDTO> laydanhsachDiem(){
        this.diemList = diemDAO.layDanhSachDiem();
        return this.diemDAO.getDiemList();        
    }
    
    public void hienThiDanhSachDiem(JTable tbl){
        diemDAO.layDanhSachDiem();
        DefaultTableModel diemTable = (DefaultTableModel) tbl.getModel();
        diemTable.setRowCount(0);         
        Object rowDiem[] = new Object[7];
        for (int i = 0; i < diemList.size() ; i++){
            rowDiem [0] = diemList.get(i).getMSSV();
            rowDiem [1] = diemList.get(i).getMaMon();
            rowDiem [2] = diemList.get(i).getDiemQuaTrinh();
            rowDiem [3] = diemList.get(i).getDiemThi();
            rowDiem [4] = diemList.get(i).getDiemTongKet();
            rowDiem [5] = diemList.get(i).getDiemChu();
            rowDiem [6] = diemList.get(i).getMaHocKi();
            diemTable.addRow(rowDiem);
         }
    }
    public ArrayList<DiemDTO> layDiemTheoMSSV(){
        this.diemList = diemDAO.laydiemtheoMSSV();
        return this.diemDAO.getDiemList();        
    }
    
    public void hienThiDiemTheoMa(JTable tbl){
        diemDAO.laydiemtheoMSSV();
        DefaultTableModel diemTable = (DefaultTableModel) tbl.getModel();
        diemTable.setRowCount(0);         
        Object rowDiem[] = new Object[7];
        for (int i = 0; i < diemList.size() ; i++){
            rowDiem [0] = diemList.get(i).getMSSV();
            rowDiem [1] = diemList.get(i).getMaMon();
            rowDiem [2] = diemList.get(i).getDiemQuaTrinh();
            rowDiem [3] = diemList.get(i).getDiemThi();
            rowDiem [4] = diemList.get(i).getDiemTongKet();
            rowDiem [5] = diemList.get(i).getDiemChu();
            rowDiem [6] = diemList.get(i).getMaHocKi();
            diemTable.addRow(rowDiem);
         }
    }
}

