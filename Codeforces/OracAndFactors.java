import java.util.Scanner;

public class OracAndFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            // Calculate the final value of n
            for (int j = 0; j < k; j++) {
                n += smallestPositiveDivisor(n);
            }

            System.out.println(n);
        }
    }

    // Function to find the smallest positive divisor of n, except 1
    static int smallestPositiveDivisor(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
