package Problem1Java;

public class Student {
   private int age ;
   private int id ;
   private String name ;


   Student( int age, int id, String name ) {
       this.age=age ;
       this.id=id ;
       this .name =name ;
       print();
   } ;



   private void print() {
       System.out.println( " Student name is :  " + name );
       System.out.println( " Student ID is :  " + id );
       System.out.println( " Student Age is :  " + age );
   }

}
