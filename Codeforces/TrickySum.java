import java.util.Scanner;

public class TrickySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long result = calculateSum(n);
            System.out.println(result);
        }

        scanner.close();
    }

    static long calculateSum(long n) {
         long sum = n * (n + 1) / 2;

        // Subtract powers of 2 twice
        for (long i = 1; i <= n; i *= 2) {
            sum -= 2 * i;
        }
        return sum;
    }
}

