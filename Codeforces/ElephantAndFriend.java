import java.util.Scanner;

public class ElephantAndFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int x = scanner.nextInt();

        // Calculate and print the minimum number of steps
        int steps = (int) Math.ceil((double) x / 5);
        System.out.println(steps);

        // Close the scanner
        scanner.close();
    }
}

