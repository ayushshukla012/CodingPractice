import java.util.Scanner;

public class ZeroesAndOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Length of the string
        scanner.nextLine(); // Consume the newline character
        String s = scanner.nextLine(); // The string of zeros and ones

        int result = findMinimumLength(n, s);
        System.out.println(result);
    }

    // Function to find the minimum length of the string after applying the described operations
    static int findMinimumLength(int n, String s) {
        int countZeros = 0;
        int countOnes = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                countZeros++;
            } else {
                countOnes++;
            }
        }

        // The minimum length is the absolute difference between countZeros and countOnes
        return Math.abs(countZeros - countOnes);
    }
}

