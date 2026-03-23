package ProblemN;

import java.util.Scanner;

public class Histogram {
        char symbol;

    public void setSymbol(char symbol) {
        if(symbol=='+' || symbol=='-' || symbol=='/' || symbol=='*')
            this.symbol=symbol;
    }

    public void print(int outerCount , Scanner scanner) {

        for(int i=0 ; i<outerCount ; i++)
        {
            int innerCount= scanner.nextInt();
            for(int j=0 ; j<innerCount ; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
