import java.util.Scanner;

public class gameWinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String plays = scanner.next();

            char[] playArray = plays.toCharArray();

            // Determine the winner based on the plays
            char winner = determineWinner(playArray);

            // Output the result for each test case
            System.out.println(winner);
        }

        scanner.close();
    }

    private static char determineWinner(char[] plays) {
        int countA = 0; // Number of wins for player A
        int countB = 0; // Number of wins for player B

        for (char play : plays) {
            if (play == 'A') {
                countA++;
            } else {
                countB++;
            }

            // Check if either player has reached X wins
            if (countA >= Math.ceil(plays.length / 2.0) || countB >= Math.ceil(plays.length / 2.0)) {
                break;
            }
        }

        // Check the final winner based on the total wins
        if (countA > countB) {
            return 'A';
        } else if (countB > countA) {
            return 'B';
        } else {
            return '?';
        }
    }
}

