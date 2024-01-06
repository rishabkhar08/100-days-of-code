public class SumZero {
    public static void main(String[] args) {
        int n = 5;
        for (int i : FindSumZero(n) ) {
            System.out.print(i + " ");
        }
    }

    public static int[] FindSumZero(int n) {
        int[] result = new int[n];
        int start = -(n / 2);

        for (int i = 0; i < n; i++) {
            result[i] = start++;
        }

        return result;
    }
}
