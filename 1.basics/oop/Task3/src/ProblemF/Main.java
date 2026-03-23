package ProblemF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        MultiplicationTable table = new MultiplicationTable();
        table.printTable(N);
    }
}