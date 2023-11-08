import java.util.Scanner;

public class NewYearsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number to represent

            if (isRepresentable(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // Function to check if n is representable as the sum of 2020s and 2021s
    static boolean isRepresentable(int n) {
        if (n < 2020) {
            return false;
        }

        int max2020s = n / 2020;
        for (int i = 0; i <= max2020s; i++) {
            int remaining = n - (i * 2020);
            if (remaining % 2021 == 0) {
                return true;
            }
        }

        return false;
    }
}

