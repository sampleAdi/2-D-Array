import java.util.*;

public class DiagonalSum {
    public static int diagonalsum(int matrix[][]) {
        int sum = 0, n = matrix.length;
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            sum = sum + matrix[i][i];
            if (i != j)
                sum = sum + matrix[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println("Diagonal Sum is " + diagonalsum(matrix));
    }
}
