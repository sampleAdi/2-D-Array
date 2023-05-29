import java.util.*;

public class TwoD_Array {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        n = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        m = sc.nextInt();
        int matrix[][] = new int[n][m];
        n = matrix.length;
        m = matrix[0].length;
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
