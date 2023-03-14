
package DoAnQLSV.DTO;

/**
 *
 * @author badao
 */
public class DiemDTO {
        //thuoc tinh
    private String MSSV;
    private String MaMon;
    private float DiemQuaTrinh;
    private float DiemThi;
    private float DiemTongKet;
    private String DiemChu;
    private String MaHocKi;
    
    private float DTB;
    
    public DiemDTO(){
        this.MSSV="";
        this.MaMon="";
        this.DiemQuaTrinh=0;
        this.DiemThi=0;
        this.DiemTongKet=0;
        this.DiemChu="";
        this.MaHocKi="";
    }
    public DiemDTO(String MSSV,String MaMon,float DiemQuaTrinh,float DiemThi,float DiemTongKet,String DiemChu,String MaHocKi){
        this.MSSV=MSSV;
        this.MaMon=MaMon;
        this.DiemQuaTrinh=DiemQuaTrinh;
        this.DiemThi=DiemThi;
        this.DiemTongKet=DiemTongKet;
        this.DiemChu=DiemChu;
        this.MaHocKi=MaHocKi;
    }
    public DiemDTO(DiemDTO diem){
        this.MSSV=diem.MSSV;
        this.MaMon=diem.MaMon;
        this.DiemQuaTrinh=diem.DiemQuaTrinh;
        this.DiemThi=diem.DiemThi;
        this.DiemTongKet=diem.DiemTongKet;
        this.DiemChu=diem.DiemChu;
        this.MaHocKi=diem.MaHocKi;
    }
    // phuong thuc (Method)
    public float tinhDiemTongKet(){
        this.DiemTongKet = (this.DiemQuaTrinh + this.DiemThi)/2;
        return this.DiemTongKet;
    }

    
    public String tinhDiemChu(){
        if (this.DiemTongKet < 10)
        {
            this.DiemChu = "A";
        }
        if (this.DiemTongKet <= 8.4)
        {
            this.DiemChu = "B+";
        }
        if (this.DiemTongKet <= 7.7)
        {
            this.DiemChu = "B";
        }
        if (this.DiemTongKet <= 6.9)
        {
            this.DiemChu = "C+";
        }
        if (this.DiemTongKet <= 6.2)
        {
            this.DiemChu = "C";
        }
        if (this.DiemTongKet <= 5.4)
        {
            this.DiemChu = "D+";
        }
        if (this.DiemTongKet <= 4.7)
        {
            this.DiemChu = "D";
        }
        if (this.DiemTongKet <= 3.9)
        {
            this.DiemChu = "F+";
        }
        if (this.DiemTongKet <= 2.9)
        {
            this.DiemChu = "F";
        }
        return this.DiemChu;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public float getDiemQuaTrinh() {
        return DiemQuaTrinh;
    }

    public void setDiemQuaTrinh(float DiemQuaTrinh) {
        this.DiemQuaTrinh = DiemQuaTrinh;
    }

    public float getDiemThi() {
        return DiemThi;
    }

    public void setDiemThi(float DiemThi) {
        this.DiemThi = DiemThi;
    }

    public float getDiemTongKet() {
        return DiemTongKet;
    }

    public void setDiemTongKet(float DiemTongKet) {
        this.DiemTongKet = DiemTongKet;
    }

    public String getDiemChu() {
        return DiemChu;
    }

    public void setDiemChu(String DiemChu) {
        this.DiemChu = DiemChu;
    }

    public String getMaHocKi() {
        return MaHocKi;
    }

    public void setMaHocKi(String MaHocKi) {
        this.MaHocKi = MaHocKi;
    }

    /**
     * @return the DTB
     */
    public float getDTB() {
        return DTB;
    }

    /**
     * @param DTB the DTB to set
     */
    public void setDTB(float DTB) {
        this.DTB = DTB;
    }
}
