package ProblemE;

import java.util.Scanner;
import java.util.Vector;

public class MaxNumber {
    private int N ;


    public void checkMax(int N) {

        int currentNumber = 0 ;
        Scanner scanner = new Scanner(System.in);
        for(int i =0 ; i<N ; i++) {
            int x = scanner.nextInt();
            if(x>currentNumber) {
                currentNumber=x;
            }

        }
        System.out.println(currentNumber);
    }
}
