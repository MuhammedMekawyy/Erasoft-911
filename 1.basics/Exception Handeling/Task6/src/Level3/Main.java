package Level3;

//🟠 Level 3: Custom Exceptions
//🧩 Task 7: Create a Custom Exception
//Create a custom exception InvalidAgeException. If user age < 18, throw the exception.
//
//        🧩 Task 9: Propagate Exception
//Create a method that throws an exception and another method that calls it.
// Demonstrate how exceptions propagate.
//
//        🧩 Task 10: Throws Keyword
//Create a method readFile() that throws IOException. Call it from main() using try-catch.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void method1() throws ArithmeticException {
        int result = 10 / 0;
    }
    public static void method2() throws ArithmeticException {
        method1();
    }
    public static void readFile() throws IOException {
        Scanner sc = new Scanner(new File("src/Level3/testttt.txt"));

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

        public static void main(String[] args) {
        try {
            method2(); // exception propagates to main
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e);
        }
            try {
                readFile(); // call method
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

    }
}
