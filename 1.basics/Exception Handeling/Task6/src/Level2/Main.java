package Level2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Task4
        int []arr =new int[]{4,3,2,1,5};
        int index= scanner.nextInt();
        try{
        System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index you entered is out of boundry");
        }
        //Task5
        try (Scanner scanner1 = new Scanner(new File("src/Level2/test.txt"))) {
            while (scanner1.hasNextLine()) {
                System.out.println(scanner1.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        //Task6
        String number = scanner.next();
        int x = scanner.nextInt();
        try {
             int y = Integer.parseInt(number);
            System.out.println(y/x);
        } catch (NumberFormatException e)
        {
            System.out.println("You should enter number");
        }
        catch (ArithmeticException exception) {
            System.out.println("you cannot divide by zero");
        }


    }
}
