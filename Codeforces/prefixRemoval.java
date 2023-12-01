import java.util.Scanner;

public class prefixRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            String result = finalState(s);
            System.out.println(result);
        }

        scanner.close();
    }

    private static String finalState(String s) {
        while (true) {
            int x = longestPrefix(s);
            if (x == 0) {
                break;
            }
            s = s.substring(x);
        }
        return s;
    }

    private static int longestPrefix(String s) {
        int n = s.length();
        int longest = 0;

        for (int i = 1; i <= n; i++) {
            if (s.startsWith(s.substring(i))) {
                longest = i;
            }
        }

        return longest;
    }
}

