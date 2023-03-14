
package DoAnQLSV.BLL;

import DoAnQLSV.DAO.HocKiDAO;
import DoAnQLSV.DTO.HocKiDTO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author badao
 */
public class HocKiBLL {
    private ArrayList<HocKiDTO>  lopList;
    private HocKiDAO lopDAO;
    
    public HocKiBLL()
    {
        lopList = new ArrayList<HocKiDTO>();
        lopDAO = new HocKiDAO();
    }
        public ArrayList<HocKiDTO> layDanhSachHocKi(){
        this.lopList = lopDAO.layDanhSachHocKi();
        return this.lopDAO.getHockiList();          
    }

    public void LoadCBBMaHocKi(JComboBox cbb)
    {
        lopDAO.layDanhSachHocKi();
        DefaultComboBoxModel lopCBB =  (DefaultComboBoxModel) cbb.getModel();
        for (int i = 0; i < lopList.size() ; i++){      
            lopCBB.addElement(lopList.get(i).getMaHocKy());            
            }
    }
}
