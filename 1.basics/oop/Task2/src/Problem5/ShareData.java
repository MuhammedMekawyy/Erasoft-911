package Problem5;

public class ShareData extends BaseEntity {
    private int phone ;

    public ShareData(int id, String name , int phone) {
        super(id,name);
        this.phone=phone ;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
