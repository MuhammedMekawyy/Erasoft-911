package Problem3;

import java.util.Scanner;

public class main {
    public static void main(String[]args) {
        Sum sum=new Sum() ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int n2 = scanner.nextInt();
        System.out.print("Enter third number : ");
        int n3 = scanner.nextInt();
        sum.setNumbers(n1 ,n2 ,n3);
        sum.getSum();

    }
}
