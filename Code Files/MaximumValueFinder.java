import java.util.ArrayList;
import java.util.List;

public class MaximumValueFinder {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2,2};
        int v = 2;
        for (boolean bool : MaximumValueFinderWithAddedValue(arr, v)) {
            System.out.print(bool + " ");
        }
    }

    public static List<Boolean> MaximumValueFinderWithAddedValue(int[] arr, int addedValue)
    {
        int max = 0;
        int n = arr.length;
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            max = Math.max(max, arr[i]); 
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] + addedValue >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
