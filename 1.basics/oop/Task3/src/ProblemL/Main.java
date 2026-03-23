package ProblemL;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        GCDCalculator calc = new GCDCalculator();
        System.out.println(calc.gcd(A, B));
    }
}
