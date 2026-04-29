package Service.impl;

import Service.HelperServices;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;


public class HelperServiceImpl implements HelperServices {

     private int invalidExceptionCounter;
     Scanner sc = new Scanner(System.in);

     @Override
    public String readLine(String message) {
        System.out.print(message +"");
        return sc.next();
    }

    @Override
    public String readValidString(String message, Predicate<String> validator, String errorMsg) {
        for (int i = 0; i < 3; i++) {
            String input = readLine(message);

            if (validator.test(input)) {
                return input;
            }

            System.out.println(errorMsg + " Attempts left: " + (2 - i));
        }

        System.out.println("Too many failed attempts.");
        return null;
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
    public double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + "");
                double value = sc.nextDouble();
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


    @Override
    public String maskPassword(String password) {
        if (password == null || password.isEmpty()) {
            return "";
        }

        return "*".repeat(password.length());
    }

}
