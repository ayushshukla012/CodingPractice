import java.util.Scanner;

public class chessBoardCoders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Output the maximum number of Coders
        System.out.println((n * n + 1) / 2);

        // Initialize the chessboard configuration array
        char[][] chessboard = new char[n][n];

        // Fill the chessboard with Coders in an alternating pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Place Coder in alternating positions
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = 'C';
                } else {
                    chessboard[i][j] = '.';
                }
            }
        }

        // Output the chessboard configuration
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chessboard[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}

