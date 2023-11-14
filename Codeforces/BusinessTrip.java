import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] growthValues = new int[12];

        for (int i = 0; i < 12; i++) {
            growthValues[i] = scanner.nextInt();
        }

        int result = findMinimumMonths(k, growthValues);
        System.out.println(result);
    }

    static int findMinimumMonths(int k, int[] growthValues) {
        Arrays.sort(growthValues);
        int cumulativeGrowth = 0;
        int months = 0;

        for (int i = 11; i >= 0 && cumulativeGrowth < k; i--) {
            cumulativeGrowth += growthValues[i];
            months++;
        }

        return (cumulativeGrowth >= k) ? months : -1;
    }
}

