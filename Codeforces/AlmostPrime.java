import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] count = new int[n + 1];

        // Sieve of Eratosthenes to find prime numbers
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                for (int j = i; j <= n; j += i) {
                    isPrime[j] = true;
                    count[j]++;
                }
            }
        }

        // Count almost prime numbers
        int almostPrimeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (count[i] == 2) {
                almostPrimeCount++;
            }
        }

        System.out.println(almostPrimeCount);
    }
}

