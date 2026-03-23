package Problem18.Pack1;

public class PlayerBenfit {
    protected int id;
    protected double benfitPlayer;
    double allPlayerbenfit; // default

    public PlayerBenfit(int id, double benfitPlayer, double allPlayerbenfit) {
        this.id = id;
        this.benfitPlayer = benfitPlayer;
        this.allPlayerbenfit = allPlayerbenfit;
    }
}