package Java8.Matrix;

/*
 Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's in-place.
 */
public class SetMatrixZeroes {

    static void naiveBaseApproach_TwoBooleanArrays(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] localMatrix = {
            {1,2,0},
            {2,3,4},
            {2,0,4}
        };

        //Time Complexity-O(n*m) and Space-O(n+m)
        naiveBaseApproach_TwoBooleanArrays(localMatrix);
    }
}