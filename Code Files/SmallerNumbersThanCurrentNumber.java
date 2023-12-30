import java.util.*;

public class SmallerNumbersThanCurrentNumber {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 2, 3 };
        for (int i : SmallerNumbersThanCurrent(arr)) {
            System.out.print(i + " ");
        }
        for (int i : SmallerNumbersThanCurrentHashMap(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] SmallerNumbersThanCurrent(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
            res[i] = count;
        }
        return res;
    }

    public static int[] SmallerNumbersThanCurrentHashMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = arr.clone();
        Arrays.sort(res);

        for(int i=0; i < arr.length; i++)
        {
            map.putIfAbsent(res[i], i);
        }

         for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}
