import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = { -8, 2, 3, -6, 10 };
        int k = 2;
        List<Integer> res = BruteFindFirstNegative(arr, k);
        for (Integer integer : res) {
            System.out.print(integer + " ");
        }
        System.out.println();
        res = FindFirstNegative(arr, k);
        for (Integer integer : res) {
            System.out.print(integer + " ");
        }

    }

    public static List<Integer> BruteFindFirstNegative(int[] arr, int k) {
        List<Integer> finalList = new ArrayList<>();

        int l = 0;
        int r = k - 1;
        int count = 0;

        while (r < arr.length) {
            List<Integer> tempArr = new ArrayList<>();
            for (int i = l; i <= r; i++) {
                tempArr.add(arr[i]);
            }

            boolean foundNegative = false;

            for (int i : tempArr) {
                if (i < 0) {
                    finalList.add(i);
                    foundNegative = true;
                    break;
                }
            }

            if (!foundNegative) {
                finalList.add(0);
            }

            count++;
            l++;
            r++;
        }

        return finalList;
    }

    public static List<Integer> FindFirstNegative(int[] arr, int k) {
        int i = 0, j = 0;
        List<Integer> tempStore = new ArrayList<>();
        List<Integer> finalRes = new ArrayList<>();

        while (j < arr.length) {
            if (arr[j] < 0) {
                tempStore.add(arr[j]);
            }

            if (j - i + 1 != k) {
                j++;
            } else {
                if (tempStore.isEmpty()) {
                    finalRes.add(0);
                } else {
                    finalRes.add(tempStore.get(0));
                    if (arr[i] < 0) {
                        tempStore.remove(0);
                    }
                }
                j++;
                i++;
            }
        }

        return finalRes;
    }
}
