import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of problems
            int k = scanner.nextInt(); // Maximum allowed absolute difference
            int[] difficulties = new int[n];

            for (int j = 0; j < n; j++) {
                difficulties[j] = scanner.nextInt();
            }

            int result = findMinProblemsToRemove(n, k, difficulties);
            System.out.println(result);
        }
    }

    // Function to find the minimum number of problems to remove to make the round balanced
    static int findMinProblemsToRemove(int n, int k, int[] difficulties) {
        Arrays.sort(difficulties);
        int minProblemsToRemove = 0;

        for (int i = 1; i < n; i++) {
            if (difficulties[i] - difficulties[i - 1] > k) {
                minProblemsToRemove++;
            }
        }

        return minProblemsToRemove;
    }
}

