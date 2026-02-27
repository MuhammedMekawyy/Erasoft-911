package Problem5;

public class Player extends ShareData {
    private int number ;

    public Player(int id, String name, int phone, int number) {
        super(id, name, phone);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
