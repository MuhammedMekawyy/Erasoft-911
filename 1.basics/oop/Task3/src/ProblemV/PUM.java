package ProblemV;

public class PUM {
    public void print(int n) {
        int num = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(num + " ");
            System.out.print((num + 1) + " ");
            System.out.print((num + 2) + " ");
            System.out.println("PUM");

            num += 4;
        }
    }
}
