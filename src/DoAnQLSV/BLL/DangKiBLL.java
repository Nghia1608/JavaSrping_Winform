
package DoAnQLSV.BLL;

import DoAnQLSV.DAO.*;
import javax.swing.*;
import DoAnQLSV.DAO.*;
import DoAnQLSV.DTO.DangKiDTO;
import java.util.ArrayList;


public class DangKiBLL {
    private ArrayList<DangKiDTO>  dangkiList;
    private DangKiDAO dangKiDAO;
        public static String message = null;
    
    public DangKiBLL()
    {
        dangkiList = new ArrayList<DangKiDTO>();
        dangKiDAO = new DangKiDAO();
    }
  public void  themTaiKhoan(DangKiDTO dangki)
    {
        dangKiDAO.ThemTaiKhoan(dangki);
        message = dangKiDAO.message;
    }
   
    public void  suaTaiKhoan(DangKiDTO dangki)
    {
        dangKiDAO.SuaTaiKhoan(dangki);
        message = dangKiDAO.message;
    }
  
    public ArrayList<DangKiDTO> laydanhsachTaiKhoan(){
        this.dangkiList = dangKiDAO.layDanhSachTaiKhoan();
        return this.dangkiList;        
    }
}
