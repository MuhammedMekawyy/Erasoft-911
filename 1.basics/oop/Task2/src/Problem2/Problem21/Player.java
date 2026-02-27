package Problem2.Problem21;

public class Player {
    private int number ;
    private String name ;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
        print();
    }
    private void print()
    {
        System.out.println("Player name is :  " +name );
        System.out.println( "Player number is :  "+number );
    }
}
