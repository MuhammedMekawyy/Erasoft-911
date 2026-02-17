package Problem4CF;

public class Difference {
   private int num1 ;
   private int num2 ;
   private int num3 ;
   private int num4 ;


   Difference (int num1 ,int num2 , int num3 , int num4) {
       this.num1=num1;
       this.num2=num2;
       this.num3=num3;
       this.num4=num4;

       print ();

   }



   private void print() {

       long result = ((long)num1*num2)-((long)num3 * num4) ;
       System.out.println("Difference = " + result );

   }









}
