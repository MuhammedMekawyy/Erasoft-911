package Problem2CF;

public class BasicDataTypes {
    private int x ;
    private long  y ;
    private char z;
    private float f ;
    private double d ;


    BasicDataTypes( int x , long y , char z , float f , double d ) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.f = f;
        this.d = d;

        print() ;
    }

    private void print() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(f);
        System.out.println(d);
    }

}
