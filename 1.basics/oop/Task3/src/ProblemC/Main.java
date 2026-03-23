package ProblemC;

import java.util.Scanner;

public class Main {

    public static void main(String[]args) {
        Classification classification =new Classification();
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        classification.classify(N,scanner);
        classification.pint();
    }
}
