import java.util.*;

public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        for (int i : FindSpiralTraversalOfMatrix(matrix)) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> FindSpiralTraversalOfMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        List<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }

        return list;
    }
}
