package Problem3CF;

public class Calculator {

    private int x;
    private int y;

    Calculator (int x , int y) {
        this.x=x;
        this.y=y;

        printResults();
    }

   private void printResults() {
        long mul = (long)x * (long)y ;
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " * " + y + " = " + mul) ;
        System.out.println(x + " - " + y + " = " + (x - y));
    }

}
