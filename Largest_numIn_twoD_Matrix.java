import java.util.*;

public class Largest_numIn_twoD_Matrix {

    public static int largest(int matrix[][]) {
        int larger = Integer.MIN_VALUE;
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > larger) {
                    larger = matrix[i][j];
                }
            }
        }
        return larger;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println("Largest no. in 2-D Matrix is " + largest(matrix));
    }
}
