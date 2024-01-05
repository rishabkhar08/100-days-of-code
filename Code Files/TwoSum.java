import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 13, 2, 14, 3, 7, 11, 15 };
        int taget = 9;
        for (int i : BruteFindTwoSum(arr, taget)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : HashMapTwoSum(arr, taget)) {
            System.out.print(i + " ");
        }
    }

    public static int[] BruteFindTwoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static int[] HashMapTwoSum (int[] nums, int target) {
       Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) 
            {
                return new int[] { numMap.get(complement), i };
            } 
            else{
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    } 
}

