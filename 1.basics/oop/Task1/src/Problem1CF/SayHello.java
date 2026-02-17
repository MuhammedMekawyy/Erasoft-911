package Problem1CF;

public class SayHello {
    private String name ;

    SayHello( String name ) {
        this.name=name ;
        print() ;
    }

    private void print() {
        System.out.println("Hello, " + name);
    }
}
