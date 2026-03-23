package ProblemY;

public class Fibonacci {

    public void printSeries(int n) {
        if (n >= 1) System.out.print(0);
        if (n >= 2) System.out.print(" 1");

        int a = 0, b = 1;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}