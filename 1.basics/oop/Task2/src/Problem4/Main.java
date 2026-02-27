package Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter player name : ");
        String name = sc.nextLine();

        System.out.print("Please enter player id : ");
        int id = sc.nextInt();

        System.out.print("Please enter player number : ");
        int number= sc.nextInt();

        System.out.println("---------------------");

        Player p1 = new Player(id ,name ,number);
        p1.print();

        System.out.println("---------------------");

        sc.nextLine(); //Question in this line

        System.out.print("Please enter Student name : ");
        String studentName = sc.nextLine();

        System.out.print("Please enter Student id : ");
        int studentId = sc.nextInt();

        System.out.print("Please enter Student age : ");
        int age = sc.nextInt();

        System.out.println("---------------------");
        Student student = new Student(studentId ,studentName,age);
        student.print();

    }
}
