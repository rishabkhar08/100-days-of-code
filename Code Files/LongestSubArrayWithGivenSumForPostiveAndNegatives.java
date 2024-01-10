import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSumForPostiveAndNegatives {
    public static void main(String[] args) {
        int[] arr = { 2, 0, -1, 1, 1 };
        int k = 1;
        System.out.println("Brute Force : " + FindLongestSubArrayWithGivenSumUsingBruteForce(arr, k));
        System.out.println("Hash Map : " + FindLongestSubArrayWithGivenSumUsingHashMap(arr, k));
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

    public static int FindLongestSubArrayWithGivenSumUsingHashMap(int[] arr, int k) {

        int max = 0, sum = 0;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            int rem = sum - k;

            if (map.containsKey(rem)) {
                max = Math.max(max, i - map.get(rem));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }

        return max;
    }

}
