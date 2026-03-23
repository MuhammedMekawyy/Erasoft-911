package ProblemO;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Pyramid pyramid = new Pyramid();
        Scanner scanner = new Scanner(System.in);
        int outerCount = scanner.nextInt();
        pyramid.print(outerCount);
    }
}
