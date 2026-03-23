package ProblemC;

import java.util.Scanner;

public class Classification {
    private int even;
    private int odd;
    private int positive;
    private int negative;


    public void classify(int N, Scanner scanner) {
        for(int i=0 ; i<N ; i++) {
            int input = scanner.nextInt();
            if(input%2==0 || input==0)
                even++;
            else
                odd++;

            if(input>0)
                 positive++;
            else if(input<0)
                 negative++;
        }

    }

    public void pint() {
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
    }
}
