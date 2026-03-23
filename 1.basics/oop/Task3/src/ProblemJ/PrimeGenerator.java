package ProblemJ;

public class PrimeGenerator {

    public boolean isPrime(int x) {
        if (x <= 1)
            return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
