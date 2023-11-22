import java.util.Scanner;

public class RabbitLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int maxJoy = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int fi = scanner.nextInt();
            int ti = scanner.nextInt();

            int joy;

            if (ti > k) {
                joy = fi - (ti - k);
            } else {
                joy = fi;
            }

            maxJoy = Math.max(maxJoy, joy);
        }

        System.out.println(maxJoy);
    }
}
