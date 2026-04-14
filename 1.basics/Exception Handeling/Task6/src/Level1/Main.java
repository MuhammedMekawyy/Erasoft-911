package Level1;

//🧩 Task 3: Null Pointer
//Create a method that calls toUpperCase() on a string.
// Pass null and handle NullPointerException.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task1
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        try{
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide number by zero");
        }
        //Task2
        String number = scanner.next();
        try {
            int z = Integer.parseInt(number);
            System.out.println(z);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Yous should enter number");
        }
        //Task 3
        String word = null ;
        try {
            word.toUpperCase();
        } catch (NullPointerException e)
        {
            System.out.println("null exception");
        }


    }
}