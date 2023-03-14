
package DoAnQLSV.DTO;


public class MonHocDTO {
    
    private String MaMon;
    private String TenMon;
    private int SoTiet;
    private int SoTinChi;

    
    // ham khoi tao
    public MonHocDTO(){
        this.MaMon="";
        this.TenMon="";
        this.SoTiet =0;
        this.SoTinChi =0;
    }
    
    public MonHocDTO(String MaMon,String TenMon,int SoTiet,int SoTinChi){
        this.MaMon=MaMon;
        this.TenMon=TenMon;        
        this.SoTiet=SoTiet;   
        this.SoTinChi =SoTinChi;         
    }
    
    public MonHocDTO(MonHocDTO monhoc){
        this.MaMon=monhoc.MaMon;
        this.TenMon=monhoc.TenMon;        
        this.SoTiet=monhoc.SoTiet;   
        this.SoTinChi=monhoc.SoTinChi;  
    }

    /**
     * @return the MaMon
     */
    public String getMaMon() {
        return MaMon;
    }

    /**
     * @param MaMon the MaMon to set
     */
    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    /**
     * @return the TenMon
     */
    public String getTenMon() {
        return TenMon;
    }

    /**
     * @param TenMon the TenMon to set
     */
    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    /**
     * @return the SoTiet
     */
    public int getSoTiet() {
        return SoTiet;
    }

    /**
     * @param SoTiet the SoTiet to set
     */
    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }
    
    public int getSoTinChi() {
        return SoTinChi;
    }

    /**
     * @param SoTiet the SoTiet to set
     */
    public void setSoTinChi(int SoTinChi) {
        this.SoTinChi = SoTinChi;
    }

}
