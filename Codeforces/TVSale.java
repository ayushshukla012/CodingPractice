import java.util.Arrays;
import java.util.Scanner;

public class TVSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Total number of TV sets
        int m = scanner.nextInt(); // Maximum number of TV sets Bob can carry

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Sort the prices in ascending order
        Arrays.sort(prices);

        int maxMoney = 0;
        for (int i = 0; i < m; i++) {
            if (prices[i] < 0) {
                maxMoney -= prices[i];
            } else {
                break; // Stop if we reach non-negative prices
            }
        }

        System.out.println(maxMoney);
        scanner.close();
    }
}

