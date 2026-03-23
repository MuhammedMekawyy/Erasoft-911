package ProblemK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Divisors divisors= new Divisors();
        int number = scanner.nextInt();
        divisors.getDivisors(number);
    }
}
