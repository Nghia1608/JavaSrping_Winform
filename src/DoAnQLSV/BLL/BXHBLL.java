
package DoAnQLSV.BLL;


import DoAnQLSV.DTO.DiemDTO;
import DoAnQLSV.DAO.*;
import DoAnQLSV.DTO.LopDTO;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class BXHBLL {
    private ArrayList<DiemDTO>  diemList;
    private ArrayList<LopDTO>  lopList;
    private DiemDAO diemDAO;
    
    public BXHBLL()
    {
        diemList = new ArrayList<DiemDTO>();
        lopList = new ArrayList<LopDTO>();
        diemDAO = new DiemDAO();
    }

    public ArrayList<DiemDTO> laydanhsachDiemTB(){
        this.diemList = diemDAO.layDiemTBTheoSV();
        return this.diemDAO.getDiemList();        
    }
        
    public void hienThiDTB(JTable tbl){
        diemDAO.layDiemTBTheoSV();
        DefaultTableModel diemTable = (DefaultTableModel) tbl.getModel();
        diemTable.setRowCount(0);         
        Object rowDiem[] = new Object[4];
        for (int i = 0; i < diemList.size() ; i++){
            rowDiem [0] = diemList.get(i).getMSSV();
            rowDiem [1] = diemList.get(i).getDTB();

            diemTable.addRow(rowDiem);
         }
        
    }
    
    public ArrayList<DiemDTO> layDiemTheoMSSV(){
        this.diemList = diemDAO.laydiemtheoMSSV();
        return this.diemDAO.getDiemList();        
    }
    
    public void hienThiDiemTheoMa(JTable tbl){
        diemDAO.layDiemTBTheoSV();
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

