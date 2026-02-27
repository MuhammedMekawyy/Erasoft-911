package Problem2.Problem22;

import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Teacher teacher = new Teacher() ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter first Name : ");
        String name = scanner.next();
        teacher.setName(name);
        System.out.println("Your name is :  " + teacher.getName());

        System.out.println("--------------------");
        System.out.print("please enter age : ");
        float age =scanner.nextFloat();
        teacher.setAge(age);
        System.out.println("Your age is : " + teacher.getAge()) ;

        System.out.println("--------------------");
        System.out.print("please enter id : ");
        long id = scanner.nextLong();
        teacher.setId(id);
        System.out.println( "Your id is  : " + teacher.getId());

        System.out.println("--------------------");
        System.out.print("please enter salary : ");
        float salary= scanner.nextFloat();
        teacher.setSalary(salary);
        System.out.println("Your salary is : " +teacher.getSalary());

        System.out.println("--------------------");
        System.out.print("please enter phone number : ");
        String phoneNumber = scanner.next() ;
        teacher.setPhoneNumber(phoneNumber);
        System.out.println("Your phone number is :  " +teacher.getPhoneNumber());
    }
}
