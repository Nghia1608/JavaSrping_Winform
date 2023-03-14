
package DoAnQLSV.DTO;

/**
 *
 * @author badao
 */
public class DangKiDTO {
    //thuoc tinh
    private String ID;
    private String MSSV;
    private String Gmail;
    private String Password;
    private String Cofirm;
    private String Quyen;

    
    // ham khoi tao
    public DangKiDTO(){
        this.ID="";
        this.MSSV="";        
        this.Gmail="";
        this.Password=""; 
        this.Cofirm="";
        this.Quyen=""; 
    }
    
    public DangKiDTO(String ID,String MSSV,String Gmail,String Password,String CofirmString,String Quyen){
        this.ID=ID;
        this.MSSV=MSSV;     
        this.Gmail=Gmail;
        this.Password=Password; 
        this.Cofirm=Cofirm;
        this.Quyen=Quyen; 
    }
    
    public DangKiDTO(DangKiDTO dangki){
        this.ID=dangki.ID;
        this.MSSV=dangki.MSSV;
        this.Gmail=dangki.Gmail;
        this.Password=dangki.Password;  
        this.Cofirm=dangki.Cofirm;
        this.Quyen=dangki.Quyen;          
    }


    public String getID() {
        return ID;
    }


    public void setID(String ID) {
        this.ID = ID;
    }


    public String getMSSV() {
        return MSSV;
    }


    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getGmail() {
        return Gmail;
    }


    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String Password) {
        this.Password = Password;
    }


    public String getCofirm() {
        return Cofirm;
    }


    public void setCofirm(String Cofirm) {
        this.Cofirm = Cofirm;
    }


    public String getQuyen() {
        return Quyen;
    }


    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

}
