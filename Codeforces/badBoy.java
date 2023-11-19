import java.util.Scanner;

public class badBoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Rows of the room
            int m = scanner.nextInt(); // Columns of the room
            int x = scanner.nextInt(); // Anton's current row
            int y = scanner.nextInt(); // Anton's current column

            int[] result = findYoYoCoordinates(n, m, x, y);
            System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
        }
    }

    // Function to find the coordinates where the two yo-yos should be thrown
    static int[] findYoYoCoordinates(int n, int m, int x, int y) {
        int[] coordinates = new int[4];

        // Throw the yo-yos at the opposite corners of the room
        coordinates[0] = 1;
        coordinates[1] = 1;
        coordinates[2] = n;
        coordinates[3] = m;

        return coordinates;
    }
}

