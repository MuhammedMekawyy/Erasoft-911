package ProblemM;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        LuckyNumbers luckyNumbers=new LuckyNumbers();
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        luckyNumbers.getLucky(number1,number2);

    }
}
