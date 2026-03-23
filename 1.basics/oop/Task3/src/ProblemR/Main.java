package ProblemR;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        SequenceCalculator calc = new SequenceCalculator();

        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            if (N <= 0 || M <= 0)
                break;

            calc.process(N, M);
        }
    }
}
