/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnQLSV.DTO;

/**
 *
 * @author kshin
 */
public class KhoaHocDTO {
    //thuoc tinh
    private String MaKhoaHoc;
    private String TenKhoaHoc;

    
    // ham khoi tao
    public KhoaHocDTO(){
        this.MaKhoaHoc="";
        this.TenKhoaHoc="";        
    }
    
    public KhoaHocDTO(String MaKhoaHoc,String TenKhoaHoc){
        this.MaKhoaHoc=MaKhoaHoc;
        this.TenKhoaHoc=TenKhoaHoc;        
    }
    
    public KhoaHocDTO(KhoaHocDTO kh){
        this.MaKhoaHoc=kh.MaKhoaHoc;
        this.TenKhoaHoc=kh.TenKhoaHoc;        
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
     * @return the TenKhoaHoc
     */
    public String getTenKhoaHoc() {
        return TenKhoaHoc;
    }

    /**
     * @param TenKhoaHoc the TenKhoaHoc to set
     */
    public void setTenKhoaHoc(String TenKhoaHoc) {
        this.TenKhoaHoc = TenKhoaHoc;
    }
}

