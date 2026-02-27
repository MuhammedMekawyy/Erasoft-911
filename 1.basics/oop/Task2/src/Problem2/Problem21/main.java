package Problem2.Problem21;

import java.util.Scanner;

public class main{
    public static void main(String[]args) {

        Scanner sc= new Scanner(System.in);
        System.out.print(" please enter player name :  ");
        String name = sc.nextLine();
        System.out.print(" please enter palyer number :  ");
        int number = sc.nextInt();


        Player player = new Player( name ,number );


    }
}
