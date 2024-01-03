public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, 
                       {4,5,6},
                       {7,8,9}};
        System.out.println("Diagonal Sum : " + FindDiagonalSum(arr));
    }

    public static int FindDiagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][i];

            if (i != n - 1 - i) {
                sum = sum + mat[i][n - 1 - i];
            }
        }
        return sum;
    }
}