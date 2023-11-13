import java.util.Scanner;

public class ArrayReordering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of elements in the array
            int[] a = new int[n];

            // Read the array elements
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            int result = maxGoodPairs(n, a);
            System.out.println(result);
        }
    }

    // Function to calculate the maximum number of good index pairs
    static int maxGoodPairs(int n, int[] a) {
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (gcd(a[i], 2 * a[j]) > 1 || gcd(a[j], 2 * a[i]) > 1) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    // Function to calculate the greatest common divisor (gcd)
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

