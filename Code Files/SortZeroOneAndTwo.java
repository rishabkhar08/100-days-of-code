import java.util.Arrays;

public class SortZeroOneAndTwo {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        for (int i : BruteSortZeroOneAndTwo(arr)) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = new int[] { 2, 0, 2, 1, 1, 0 };
        for (int i : BruteSortZeroOneAndTwo2(arr)) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = new int[] { 2, 0, 2, 1, 1, 0 };
        for (int i : OptimalSortZeroOneAndTwo(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] BruteSortZeroOneAndTwo(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] BruteSortZeroOneAndTwo2(int[] arr) {
        int n = arr.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt0++;
            }
            if (arr[i] == 1) {
                cnt1++;
            }
            if (arr[i] == 2) {
                cnt2++;
            }
        }

        for (int i = 0; i < cnt0; i++) 
        {
            arr[i] = 0;
        }

        for (int i = cnt0; i < cnt0+cnt1; i++) 
        {
            arr[i] = 1;
        }

        for (int i = cnt0+cnt1; i < cnt0+cnt1+cnt2 ; i++) 
        {
            arr[i] = 2;
        }
        
        return arr;
    }

    public static int[] OptimalSortZeroOneAndTwo(int[] arr) 
    {
        // DNF algorithm
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}
