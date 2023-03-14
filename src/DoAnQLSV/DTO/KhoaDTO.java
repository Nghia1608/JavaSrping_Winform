
package DoAnQLSV.DTO;

/**
 *
 * @author badao
 */
public class KhoaDTO {
    //thuoc tinh
    private String MaKhoa;
    private String TenKhoa;

    
    // ham khoi tao
    public KhoaDTO(){
        this.MaKhoa="";
        this.TenKhoa="";        
    }
    
    public KhoaDTO(String MaKhoa,String TenKhoa){
        this.MaKhoa=MaKhoa;
        this.TenKhoa=TenKhoa;        
    }
    
    public KhoaDTO(KhoaDTO khoa){
        this.MaKhoa=khoa.MaKhoa;
        this.TenKhoa=khoa.TenKhoa;        
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

    /**
     * @return the TenKhoa
     */
    public String getTenKhoa() {
        return TenKhoa;
    }

    /**
     * @param TenKhoa the TenKhoa to set
     */
    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }
}
