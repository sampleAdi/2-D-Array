import java.util.*;

public class Smallest_numIn_twoD_Matrix {

    public static int smallest(int matrix[][]) {
        int smaller = Integer.MAX_VALUE;
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < smaller) {
                    smaller = matrix[i][j];
                }
            }
        }
        return smaller;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println("Smallest no. in 2-D Matrix is " + smallest(matrix));
    }
}
