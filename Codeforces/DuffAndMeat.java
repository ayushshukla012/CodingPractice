import java.util.Scanner;

public class DuffAndMeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];

        // Input the amounts of meat required and their prices
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }

        long totalCost = calculateTotalCost(n, a, p);
        System.out.println(totalCost);
    }

    private static long calculateTotalCost(int n, int[] a, int[] p) {
        long totalCost = 0;
        long currentCost = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Calculate the cost for the current day
            currentCost = Math.min(currentCost, p[i]);

            // Accumulate the total cost
            totalCost += (long) a[i] * currentCost;
        }

        return totalCost;
    }
}

