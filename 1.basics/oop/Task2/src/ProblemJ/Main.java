package ProblemJ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a%b==0 || b%a==0)
            System.out.println("Multiples");
        else
            System.out.println("No Multiples");
    }
}
