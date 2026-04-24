package Service.impl;

import Service.HelperServices;

import java.util.InputMismatchException;
import java.util.Scanner;


public class HelperServiceImpl implements HelperServices {

     private int invalidExceptionCounter;
     Scanner sc = new Scanner(System.in);


    @Override
    public String readLine(String message) {
        System.out.print(message +"");
        return sc.next();
    }

    @Override
    public float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + "");
                float value = sc.nextFloat();
                resetExceptionCounter();
                return value;

            } catch (InputMismatchException e) {
                handleException();
                sc.nextLine();
            }
        }
    }


    @Override
    public int readInteger(String message) {
        while (true) {
            try {
                System.out.print(message + "");
                int value = sc.nextInt();
                resetExceptionCounter();
                return value;

            } catch (InputMismatchException e) {
                handleException();
                sc.nextLine();
            }
        }
    }

    @Override
    public void handleException() {
        invalidExceptionCounter++;

        System.out.println("Invalid input! Please enter a valid value.");

        if (invalidExceptionCounter >= 3) {
            System.out.println("Too many invalid attempts. Application will now exit.");
            System.exit(0);
        }
    }

    @Override
    public void resetExceptionCounter() {
        invalidExceptionCounter = 0;
    }

}
