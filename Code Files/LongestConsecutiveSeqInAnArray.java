import java.util.*;

public class LongestConsecutiveSeqInAnArray {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 3, 2, 4 };
        System.out.println(FindLongestConsecutiveSequenceBrute(arr));

        arr = new int[] { 100, 200, 1, 3, 2, 4 };
        System.out.println(FindLongestConsecutiveSequenceOptimal(arr));

        arr = new int[] { 100, 200, 1, 3, 2, 4 };
        System.out.println(FindLongestConsecutiveSequenceOptimalHashSet(arr));
    }

    static int FindLongestConsecutiveSequenceBrute(int[] arr) {

        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            int cnt = 1;
            while (LinearSearch(arr, val + 1) == true) {
                val++;
                cnt++;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    static boolean LinearSearch(int[] arr, int s) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return true;
            }
        }

        return false;
    }

    static int FindLongestConsecutiveSequenceOptimal(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int max = 0, cnt = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = arr[i];
            } else if (arr[i] == lastSmaller) {
                cnt++;
            } else if (arr[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = arr[i];
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    static int FindLongestConsecutiveSequenceOptimalHashSet(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int maxStreak = 0;
        for (int num : numSet) {

            if (!numSet.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                while (numSet.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }

        }
        return maxStreak;
    }
}
