package Problem7;

//Please Create App that accept
//id , name , number , Fcode of clupFc and
//id , name , number , Rcode of clupRel
//of Player
// print
//  id , name , number
//id , name , number , code

public class clup {
    private int playerId ;
    private String playerName ;
    private int playerNumber ;

    public clup(int playerId, String playerName, int playerNumber) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerNumber = playerNumber;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void print() {
        System.out.println("Your Id is : " + getPlayerId());
        System.out.println("Your Name is : " + getPlayerName());
        System.out.println("Your Number is : " + getPlayerNumber());
    }
}
