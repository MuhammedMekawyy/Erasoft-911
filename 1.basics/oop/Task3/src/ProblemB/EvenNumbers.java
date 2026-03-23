package ProblemB;

public class EvenNumbers {
    public void  Print(int N) {
        if (N < 2) {
            System.out.println(-1);
            return;
        }

        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
        }
    }
}
