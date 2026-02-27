package ProblemL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String F1 = scanner.next();
        String S1 = scanner.next();


        String F2 = scanner.next();
        String S2 = scanner.next();

        if (S1.equals(S2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }

    }
}
