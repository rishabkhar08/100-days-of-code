public class LongestSubArrayWithGivenSumForPostives {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        int k = 10;
        System.out.println("Brute Force : " + FindLongestSubArrayWithGivenSumUsingBruteForce(arr, k));
        System.out.println("Hash Map : " + FindLongestSubArrayWithGivenSumUsingSlidingWindow(arr, k));
    }

    public static int FindLongestSubArrayWithGivenSumUsingBruteForce(int[] arr, int k) {
        int max = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }

    public static int FindLongestSubArrayWithGivenSumUsingSlidingWindow(int[] arr, int k) {
        int max = 0, i = 0, j = 0, sum = 0;
        int n = arr.length;
        while (j < n) {
            sum = sum + arr[j];
            if (sum < k) {
                j++;
            } else if (sum == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                sum = sum - arr[j];
                i++;
                j++;
            }

        }
        return max;
    }
}
