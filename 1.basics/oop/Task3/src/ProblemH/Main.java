package ProblemH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        PrimeChecker checker = new PrimeChecker();

        if (checker.isPrime(X))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
