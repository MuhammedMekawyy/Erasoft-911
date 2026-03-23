package ProblemG;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Factorial factorial = new Factorial();
        int cycles = scanner.nextInt();
        for(int i=0 ; i<cycles ; i++) {
            int number = scanner.nextInt();
            factorial.calculateFactorial(number);
        }

    }
}
