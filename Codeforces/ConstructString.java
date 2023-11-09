import java.util.Scanner;

public class ConstructString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            String result = constructString(n, a, b);
            System.out.println(result);
        }
    }

    // Function to construct the string based on the given conditions
    static String constructString(int n, int a, int b) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append((char) ('a' + i % b));
        }

        return result.toString();
    }
}

