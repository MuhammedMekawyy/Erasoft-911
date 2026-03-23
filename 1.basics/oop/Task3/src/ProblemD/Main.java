package ProblemD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckPassword checkPassword = new CheckPassword();

        while (true ) {
            int x= scanner.nextInt();
            if (checkPassword.check(x))
                break;
        }

    }
}
