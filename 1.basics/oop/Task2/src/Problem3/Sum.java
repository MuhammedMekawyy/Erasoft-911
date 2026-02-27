package Problem3;

public class Sum {
    private int num1;
    private int num2;
    private int num3;

    public void setNumbers (int num1 , int num2 ,int num3 )  {
        if ( (num1%2 != 0) || (num2%2 != 0) || (num3%2 != 0) )
            System.out.println("Three numbers must be even ");
        else
        {
            this.num1=num1 ;
            this.num2=num2 ;
            this.num3=num3 ;
        }
    }
    public void getSum() {
        if ( (num1%2 != 0) || (num2%2 != 0) || (num3%2 != 0) )
            System.out.println(( (long)this.num1 + this.num2 + this.num3));
        else
            System.out.println("Sum is : null");
    }
}
