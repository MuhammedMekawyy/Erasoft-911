package ProblemK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int min=1000000;
        int max=-1000000;
        int[] numbers=new int[3];
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        int z= scanner.nextInt();
        numbers = new int[]{x, y, z};

        for (int i=0 ; i< numbers.length ; i++) {
            if (numbers[i] > max)
                max=numbers[i];
             if (numbers[i] < min) {
                min=numbers[i];
            }
        }

        System.out.println(min+" "+max);

    }
}
