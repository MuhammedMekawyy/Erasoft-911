package ProblemX;

public class Convert {

    public int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public int solve(int n) {
        int ones = countOnes(n);
        return (1 << ones) - 1;
    }
}
