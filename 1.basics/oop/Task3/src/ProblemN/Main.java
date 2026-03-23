package ProblemN;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Histogram histogram=new Histogram();
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        int outerCount = scanner.nextInt();
        histogram.setSymbol(character);
        histogram.print(outerCount,scanner );
    }
}
