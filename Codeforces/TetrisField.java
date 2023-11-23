import java.util.Scanner;

public class TetrisField {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] heights = new int[n];
            for (int j = 0; j < n; j++) {
                heights[j] = scanner.nextInt();
            }

            System.out.println(canClearTetrisField(n, heights) ? "YES" : "NO");
        }

        scanner.close();
    }

    private static boolean canClearTetrisField(int n, int[] heights) {
        int totalBlocks = 0;
        for (int j = 0; j < n; j++) {
            totalBlocks += heights[j] / 2;
        }
        return totalBlocks % 2 == 0;
    }
}

