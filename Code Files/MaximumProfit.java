public class MaximumProfit {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(FindMaximumProfitBrute(arr));

        arr = new int[] { 7, 1, 5, 3, 6, 4 };
        System.out.println(FindMaximumProfitOptimal(arr));
    }

    static int FindMaximumProfitBrute(int[] arr) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = arr[j] - arr[i];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    static int FindMaximumProfitOptimal(int[] arr) {
        int n = arr.length;
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i] - min);
        }
        return max;
    }
}
