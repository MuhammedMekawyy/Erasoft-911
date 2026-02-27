package ProblemN;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        String result = "";


            if (Character.isUpperCase(c)) {
                c= Character.toLowerCase(c);
            } else {
                c= Character.toUpperCase(c);
            }


        System.out.println(c);
    }

}
