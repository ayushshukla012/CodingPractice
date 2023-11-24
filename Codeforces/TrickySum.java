import java.util.Scanner;

public class TrickySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long result = calculateSum(n);
            System.out.println(result);
        }

        scanner.close();
    }

    static long calculateSum(long n) {
        // Finding the highest power of 2 less than or equal to n
        long powerOfTwo = 1;
        while (powerOfTwo <= n) {
            powerOfTwo *= 2;
        }
        powerOfTwo /= 2;

        // Calculating the sum as per the given conditions
        return (n * (n + 1) / 2) - 2 * powerOfTwo;
    }
}

