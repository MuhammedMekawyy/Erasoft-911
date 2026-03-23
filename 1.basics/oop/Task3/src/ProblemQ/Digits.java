package ProblemQ;

public class Digits {
    public void print(int N) {

        if (N == 0) {
            System.out.println(0);
            return;
        }

        while (N > 0) {
            int num = N % 10;
            System.out.print(num + " ");
            N = N / 10;
        }

        System.out.println();
    }
}
