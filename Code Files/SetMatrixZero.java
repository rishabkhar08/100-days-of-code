
public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        for (int[] arr : SetMatrixZeroBrute(matrix)) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        matrix = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        for (int[] arr : SetMatrixZeroBrute(matrix)) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static int[][] SetMatrixZeroBrute(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    static int[][] SetMatrixZeroOptimal(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int col0 = 1;
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0)
                col0 = 0;
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0)
                matrix[i][0] = 0;
        }

        return matrix;
    }
}
