import java.util.Scanner;

public class distanceAndAxis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Initial position of point A
            int k = scanner.nextInt(); // Desirable absolute difference

            int result = findMinimumSteps(n, k);
            System.out.println(result);
        }
    }

    // Function to find the minimum number of steps to make point B exist
    static int findMinimumSteps(int n, int k) {
        if (n <= k) {
            return k - n;
        }

        return (n - k) % 2;
    }
}

