package ProblemT;

public class Shape2 {
    public void printShape2(int N) {

        for (int i = 1; i <= N; i++) {

            // print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
