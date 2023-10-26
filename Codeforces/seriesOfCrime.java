import java.util.*; 
public class seriesOfCrime
{ 
    public static void main(String[] args)  
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            map[i] = line.toCharArray();
        }

        int[] row1 = new int[2];
        int[] row2 = new int[2];
        int[] row3 = new int[2];

        int asteriskCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == '*') {
                    if (asteriskCount == 0) {
                        row1[0] = i;
                        row1[1] = j;
                    } else if (asteriskCount == 1) {
                        row2[0] = i;
                        row2[1] = j;
                    } else if (asteriskCount == 2) {
                        row3[0] = i;
                        row3[1] = j;
                    }
                    asteriskCount++;
                }
            }
        }

        int row4, col4;
        if (row1[0] == row2[0]) {
            row4 = row3[0];
        } else if (row1[0] == row3[0]) {
            row4 = row2[0];
        } else {
            row4 = row1[0];
        }

        if (row1[1] == row2[1]) {
            col4 = row3[1];
        } else if (row1[1] == row3[1]) {
            col4 = row2[1];
        } else {
            col4 = row1[1];
        }

        System.out.println((row4 + 1) + " " + (col4 + 1));
     }
}
