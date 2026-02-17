package Problem2CF;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num1 = scanner.nextInt();
        long num2 = scanner.nextLong();
        char num3 = scanner.next().charAt(0);
        float num4 = scanner.nextFloat();
        double num5 = scanner.nextDouble();

        BasicDataTypes basicDataTypes = new BasicDataTypes(num1, num2 ,num3 , num4 , num5);

    }

}
