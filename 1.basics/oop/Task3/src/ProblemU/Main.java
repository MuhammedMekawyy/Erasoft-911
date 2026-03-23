package ProblemU;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        SomeSum obj = new SomeSum();
        int result = obj.calculate(N, A, B);

        System.out.println(result);
    }
}
