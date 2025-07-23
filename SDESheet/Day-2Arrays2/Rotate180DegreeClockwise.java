package SDESheet.Day-2Arrays2;

public class Rotate180DegreeClockwise {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    for(int i=2;i>=0;i--) {
        for(int j=2;j>=0;j--) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
