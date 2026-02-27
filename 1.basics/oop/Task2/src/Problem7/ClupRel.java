package Problem7;

public class ClupRel extends clup{
    private String rCode ;

    public ClupRel(int playerId, String playerName, int playerNumber, String rCode) {
        super(playerId, playerName, playerNumber);
        this.rCode = rCode;
    }

    public String getrCode() {
        return rCode;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Your rCode is : " + getrCode());
    }
}
