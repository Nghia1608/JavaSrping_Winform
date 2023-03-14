
package DoAnQLSV.DTO;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author badao
 */
public class SinhVienDTO {
    // thuoc tinh doi tuong
    private String MSSV;
    private String Ho;
    private String Ten ;
    private String CCCD;
    private String DanToc;
    private String GioiTinh;
    private String NgaySinh;
    private String SDT;
    private String Email; 
    private String MaLop;
    private String TrangThai;
    

    // ham khoi tao
    
    public SinhVienDTO(){
        this.MSSV="";
        this.Ho="";
        this.Ten="";
        this.CCCD="";
        this.DanToc="";
        this.GioiTinh="";
        this.NgaySinh="";
        this.SDT="";
        this.Email="";
        this.MaLop="";
        this.TrangThai="";
        
    }
    public SinhVienDTO(String MSSV, String Ho, String Ten, String CCCD, String DanToc, String GioiTinh, String NgaySinh, String SDT, String Email, String MaLop, String TrangThai)
    {
        this.MSSV = MSSV;
        this.Ho = Ho;
        this.Ten = Ten;
        this.CCCD = CCCD;
        this.DanToc = DanToc;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.MaLop = MaLop;
        this.TrangThai = TrangThai;
    }
    public SinhVienDTO(SinhVienDTO sv)
    {
        this.MSSV=sv.MSSV;
        this.Ho=sv.Ho;
        this.Ten=sv.Ten;
        this.CCCD=sv.CCCD;
        this.DanToc=sv.DanToc;
        this.GioiTinh=sv.GioiTinh;
        this.NgaySinh=sv.NgaySinh;
        this.SDT=sv.SDT;
        this.Email=sv.Email;
        this.MaLop=sv.MaLop;
        this.TrangThai=sv.TrangThai;
    }
    // phuong thuc
    
    
    
    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }


    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }


    public String getTen() {
        return Ten;
    }


    public void setTen(String Ten) {
        this.Ten = Ten;
    }


    public String getCCCD() {
        return CCCD;
    }


    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }


    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }


    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }


    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }


    public void setEmail(String Email) {
        this.Email = Email;
    }


    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTrangThai() {
        return TrangThai;
    }


    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
}
