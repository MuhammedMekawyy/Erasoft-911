package ProblemB;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        EvenNumbers evenNumbers=new EvenNumbers();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        evenNumbers.Print(N);
    }
}
