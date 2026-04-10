package ProblemX;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        Convert convert = new Convert();

        while (t > 0) {
            int n = scanner.nextInt();
            System.out.println(convert.solve(n));
            t--;
        }
    }

}
