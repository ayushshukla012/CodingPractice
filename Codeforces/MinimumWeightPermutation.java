import java.util.Scanner;

public class MinimumWeightPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Length of permutation

            // Generate a permutation with the minimum possible weight
            int[] permutation = new int[n];
            for (int j = 0; j < n; j++) {
                permutation[j] = (j % 2 == 0) ? (j / 2 + 1) : (n - j / 2);
            }

            // Print the generated permutation
            for (int j = 0; j < n; j++) {
                System.out.print(permutation[j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

