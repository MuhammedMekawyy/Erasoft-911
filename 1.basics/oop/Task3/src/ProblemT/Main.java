package ProblemT;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Shape2 shape2=new Shape2();
        shape2.printShape2(N);
    }
}
