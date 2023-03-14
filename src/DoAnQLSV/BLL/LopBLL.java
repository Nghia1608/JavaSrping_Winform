
package DoAnQLSV.BLL;


import DoAnQLSV.DTO.LopDTO;
import DoAnQLSV.DAO.*;
import DoAnQLSV.DTO.LopDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshin
 */
public class LopBLL {
    private ArrayList<LopDTO>  lopList;
    private LopDAO lopDAO;
    private JComboBox<JComboBox> combobox;
    public static String message = null;
    
    public LopBLL()
    {
        lopList = new ArrayList<LopDTO>();
        lopDAO = new LopDAO();
    }
    public void  themLop(LopDTO lop)
    {
//        this.lopDAO.getSvList().add(lop);
//        return this.lopDAO.getSvList();
        lopDAO.ThemLop(lop);        
        message = lopDAO.message;
    }
    
    public void suaLop(LopDTO lop)
    {
        lopDAO.suaLop(lop);        message = lopDAO.message;
    }
    public void xoaLop(LopDTO lop)
    {
        lopDAO.xoaLop(lop);        message = lopDAO.message;
    }
        public void Timkiem(LopDTO lop, JTable tb)
    {
        lopDAO.Timkiem(lop, tb);
    }
    public ArrayList<LopDTO> laydanhsachLop(){
        this.lopList = lopDAO.layDanhSachLop();
        return this.lopDAO.getLopList();          
    }
    
    public void hienThiDanhSachLop(JTable tbl){
        lopDAO.layDanhSachLop();
        DefaultTableModel lopTable = (DefaultTableModel) tbl.getModel();
        lopTable.setRowCount(0);         // them thi chi hien lop moi..k hien sql
        Object rowSV[] = new Object[5];
        for (int i = 0; i < lopList.size() ; i++){
            rowSV [0] = lopList.get(i).getMaLop();
            rowSV [1] = lopList.get(i).getTenLop();
            rowSV [2] = lopList.get(i).getSiSo();
            rowSV [3] = lopList.get(i).getMaKhoaHoc();
            rowSV [4] = lopList.get(i).getMaKhoa();
          
            
            lopTable.addRow(rowSV);

            
            }
    }

    public void LoadCBBMaLop(JComboBox cbb)
    {
        lopDAO.layDanhSachLop();
        DefaultComboBoxModel lopCBB =  (DefaultComboBoxModel) cbb.getModel();
        for (int i = 0; i < lopList.size() ; i++){      
            lopCBB.addElement(lopList.get(i).getMaLop());            
            }
    }

}

