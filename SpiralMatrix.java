import java.util.*;

// For spiral matrix n is always equal to m.

public class SpiralMatrix {
    public static void spiral(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int startrow = 0;
        int startcol = 0;
        int endrow = n - 1;
        int endcol = m - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // up
            for (int j = startcol; j < endcol + 1; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i < endrow + 1; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiral(matrix);
    }
}
