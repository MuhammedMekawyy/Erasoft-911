package ProblemO;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        String s= scanner.next();
        int b = scanner.nextInt();


        if(s.equals("+"))
            System.out.println((a+b));
        else if (s.equals("*"))
            System.out.println((a*b));
        else if (s.equals("-"))
            System.out.println((a-b));
        else if (s.equals("/"))
            System.out.println((a/b));
    }
}
