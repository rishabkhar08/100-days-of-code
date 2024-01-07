public class MaxSumOfSubArraySizeK {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500, 600, 700 };
        int k = 3;
        
        int res = BruteMaximumSumOfSubArraySizeK(arr, k);
        System.out.println(res);
        res = MaximumSumOfSubArraySizeK(arr, k);
        System.out.println(res);
    }

    public static int BruteMaximumSumOfSubArraySizeK(int[] arr, int k) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    public static int MaximumSumOfSubArraySizeK(int[] arr, int k) {
        int max = 0, sum = 0;
        int n = arr.length;
        int i = 0, j = 0;
        while (j < n) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }

        return max;
    }

}
