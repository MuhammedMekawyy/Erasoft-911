package ProblemM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charc = scanner.next().charAt(0);

        if((int)charc>=48 && (int)charc<65)
        {
            System.out.println("IS DIGIT");
        } else if ((int)charc>=65 && (int)charc<97) {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        } else if ((int)charc>=97) {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
    }
}
