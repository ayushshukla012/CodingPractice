import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[3][3];

        // Read the input grid
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int[][] result = calculateLightState(grid);
        
        // Output the result
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    // Function to calculate the current state of each light
    static int[][] calculateLightState(int[][] grid) {
        int[][] result = new int[3][3];

        // Iterate through the grid and apply the toggling logic
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int toggleCount = grid[i][j];

                // Check if the toggle count is odd
                if (toggleCount % 2 == 1) {
                    // Toggle the light and its side-adjacent lights
                    result[i][j] = 1 - result[i][j];
                    if (i > 0) result[i - 1][j] = 1 - result[i - 1][j];
                    if (i < 2) result[i + 1][j] = 1 - result[i + 1][j];
                    if (j > 0) result[i][j - 1] = 1 - result[i][j - 1];
                    if (j < 2) result[i][j + 1] = 1 - result[i][j + 1];
                }
            }
        }

        return result;
    }
}
