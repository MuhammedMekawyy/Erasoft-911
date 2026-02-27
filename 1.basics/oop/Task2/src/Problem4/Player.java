package Problem4;

public class Player  extends Person{
    private int number;

    public Player(int id, String name, int number) {
        super(id, name);
        setNumber(number);
    }

    public void getNumber() {
        if (this.number>0 && this.number<100)
            System.out.println("Your number is : " + this.number);
        else
            System.out.println("Your number is : Null");

    }

    private void setNumber(int number) {
        if (number>0 && number<100)
        this.number = number;
        else
            System.out.println("Number must be 2 digits");
    }
    public void print()  {
        super.print();
        getNumber();
    }

}
