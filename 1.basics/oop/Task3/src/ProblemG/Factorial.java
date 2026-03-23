package ProblemG;

public class Factorial {
    private int number ;

    public void calculateFactorial(int number) {
        long mult = 1;
        for(int i=1 ; i<=number ; i++) {
            mult = mult*i;
        }
        System.out.println(mult);
    }
}
