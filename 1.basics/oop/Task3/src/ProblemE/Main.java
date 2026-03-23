package ProblemE;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxNumber maxNumber = new MaxNumber();
        int N = scanner.nextInt();
        maxNumber.checkMax(N);
    }
}
