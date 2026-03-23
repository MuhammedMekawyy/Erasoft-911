package ProblemU;

public class SomeSum {
    // method to calculate sum of digits
    public int digitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    // method to calculate final answer
    public int calculate(int N, int A, int B) {
        int total = 0;

        for (int i = 1; i <= N; i++) {
            int sum = digitSum(i);

            if (sum >= A && sum <= B) {
                total += i;
            }
        }

        return total;
    }
}
