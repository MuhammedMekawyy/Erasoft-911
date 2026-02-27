package ProblemH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int ceil=0;
        int round=0;

        if((((double)a/b*10)%10) < 5)
            round=(a/b);
        else
            round = ((a/b)+1);

        if(a%b==0)
            ceil=a/b;
        else
            ceil= a/b + 1 ;

        System.out.println("floor "+ a +" / " +b+" = "+ (a/b) );
        System.out.println("ceil "+ a +" / " +b+" = "+ ceil );
        System.out.println("round "+ a +" / " +b+" = "+ round );
    }
}
