package ProblemP;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);
        int outerCount = scanner.nextInt();
        shape.print(outerCount);
    }
}