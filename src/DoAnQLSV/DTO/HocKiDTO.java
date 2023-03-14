
package DoAnQLSV.DTO;

/**
 *
 * @author badao
 */
public class HocKiDTO {
    private String MaHocKy;
    private String TenHocKy;
  
    public HocKiDTO(){
    this.MaHocKy="";
    this.TenHocKy="";        
    }
    
    public HocKiDTO(String MaHocKy,String TenHocKy){
        this.MaHocKy=MaHocKy;
        this.TenHocKy=TenHocKy;        
    }
    
    public HocKiDTO(HocKiDTO khoa){
        this.MaHocKy=khoa.MaHocKy;
        this.TenHocKy=khoa.TenHocKy;        
    }

    /**
     * @return the MaHocKy
     */
    public String getMaHocKy() {
        return MaHocKy;
    }

    /**
     * @param MaHocKy the MaHocKy to set
     */
    public void setMaHocKy(String MaHocKy) {
        this.MaHocKy = MaHocKy;
    }

    /**
     * @return the TenHocKy
     */
    public String getTenHocKy() {
        return TenHocKy;
    }

    /**
     * @param TenHocKy the TenHocKy to set
     */
    public void setTenHocKy(String TenHocKy) {
        this.TenHocKy = TenHocKy;
    }
}
