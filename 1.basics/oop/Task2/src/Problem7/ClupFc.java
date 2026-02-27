package Problem7;

public class ClupFc extends clup {
    private String Fcode ;

    public ClupFc(int playerId, String playerName, int playerNumber, String fcode) {
        super(playerId, playerName, playerNumber);
        Fcode = fcode;
    }

    public String getFcode() {
        return Fcode;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Your Fcode is : " + getFcode());
    }
}
