package Problem5CF;

public class CircleArea {
    private double radius;
    private final double pi = 3.141592653 ;


    CircleArea(double radius) {
        this.radius=radius;
        printResult();
    }

    private void printResult() {
        double res = pi * radius * radius ;
        System.out.printf("%.9f\n",res);
    }


}
