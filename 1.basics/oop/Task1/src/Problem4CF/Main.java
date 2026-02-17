package Problem4CF;

import Problem3CF.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){


        Scanner scanner = new Scanner(System.in) ;
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int m = scanner.nextInt();

        Difference dif = new Difference(x,y,z,m) ;

    }
}
