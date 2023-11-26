import java.util.Scanner;

public class PrimeSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (canMakeEqual(x, y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    static boolean canMakeEqual(int x, int y) {
        // Check if the absolute difference between x and y is a multiple of 2
        // If it is, then it's possible to make x equal to y by subtracting even multiples of primes
        return (x - y) % 2 == 0;
    }
}

