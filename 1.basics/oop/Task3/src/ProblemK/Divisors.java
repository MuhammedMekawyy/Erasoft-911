package ProblemK;

public class Divisors {
    private int number ;

    public void getDivisors(int number) {
        for(int i=1 ; i<=number ; i++)
        {
            if(number%i==0)
                System.out.println(i);
        }
    }
}
