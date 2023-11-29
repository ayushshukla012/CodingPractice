import java.util.Scanner;

public class DisplayTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read the number of available segments
            int n = scanner.nextInt();

            // Find the greatest integer that can be displayed
            int result = findGreatestInteger(n);

            // Print the result for each test case
            System.out.println(result);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to find the greatest integer that can be displayed with given segments
    private static int findGreatestInteger(int n) {
        // If n is even, fill all segments with 1s
        if (n % 2 == 0) {
            return (int) Math.pow(10, n / 2) - 1;
        } else {
            // If n is odd, turn on one segment for the first digit and fill the rest with 1s
            return 7 * (int) Math.pow(10, (n - 1) / 2) + (int) Math.pow(10, (n - 1) / 2) - 1;
        }
    }
}

