
package DoAnQLSV.DTO;


public class LopDTO {
    
    private String MaLop;
    private String TenLop;
    private int SiSo;
    private String MaKhoaHoc;
    private String MaKhoa;

    
    // ham khoi tao
    public LopDTO(){
        this.MaLop="";
        this.TenLop="";
        this.SiSo =0;
        this.MaKhoaHoc="";
        this.MaKhoa="";
    }
    
    public LopDTO(String MaLop,String TenLop,int SiSo,String MaKhoaHoc,String MaKhoa){
        this.MaLop=MaLop;
        this.TenLop=TenLop;        
        this.SiSo=SiSo;   
        this.MaKhoaHoc=MaKhoaHoc;   
        this.MaKhoa=MaKhoa;           
    }
    
    public LopDTO(LopDTO lop){
        this.MaLop=lop.MaLop;
        this.TenLop=lop.TenLop;        
        this.SiSo=lop.SiSo;   
        this.MaKhoaHoc=lop.MaKhoaHoc;   
        this.MaKhoa=lop.MaKhoa;        
    }

    /**
     * @return the MaLop
     */
    public String getMaLop() {
        return MaLop;
    }

    /**
     * @param MaLop the MaLop to set
     */
    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    /**
     * @return the TenLop
     */
    public String getTenLop() {
        return TenLop;
    }

    /**
     * @param TenLop the TenLop to set
     */
    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    /**
     * @return the SiSo
     */
    public int getSiSo() {
        return SiSo;
    }

    /**
     * @param SiSo the SiSo to set
     */
    public void setSiSo(int SiSo) {
        this.SiSo = SiSo;
    }

    /**
     * @return the MaKhoaHoc
     */
    public String getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    /**
     * @param MaKhoaHoc the MaKhoaHoc to set
     */
    public void setMaKhoaHoc(String MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    /**
     * @return the MaKhoa
     */
    public String getMaKhoa() {
        return MaKhoa;
    }

    /**
     * @param MaKhoa the MaKhoa to set
     */
    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
}
