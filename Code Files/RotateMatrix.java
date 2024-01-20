public class RotateMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int[] arr : RotateMatrixBrute(matrix)) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int[] arr : RotateMatrixOptimal(matrix)) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static int[][] RotateMatrixBrute(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] tempMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempMatrix[i][j] = matrix[m - 1 - j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = tempMatrix[i][j];
            }
        }

        return matrix;
    }

    static int[][] RotateMatrixOptimal(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - 1 - j];
                matrix[i][m - 1 - j] = temp; 
            }
        }

        return matrix;
    }
}
