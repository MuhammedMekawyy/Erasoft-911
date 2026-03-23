package ProblemW;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Diamond d = new Diamond();
        d.printDiamond(N);
    }
}
