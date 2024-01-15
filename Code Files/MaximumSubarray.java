import java.util.ArrayList;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(FindMaximumSubarraySumBrute(arr));

        arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(FindMaximumSubarraySumOptimal(arr));

        arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        for (int i : FindMaximumSubarrayOptimal(arr)) {
            System.out.print(i + " ");
        }
    }

    static int FindMaximumSubarraySumBrute(int[] arr) 
    {
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            for(int j = i; j < n; j++)
            {
                sum = sum + arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    static int FindMaximumSubarraySumOptimal(int[] arr) 
    {
        // Kadane's Algorithm
        int n = arr.length;
        int max = 0, sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
            max = Math.max(sum, max);
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
    }

    static int[] FindMaximumSubarrayOptimal(int[] arr) 
    {
        // Kadane's Algorithm
        int n = arr.length;
        int max = Integer.MIN_VALUE, sum = 0;
        int start = 0, end  = 0;
        for (int i = 0; i < n; i++) 
        {
            if(sum == 0) start = i;
            sum = sum + arr[i];

            if( sum > max )
            {
                max = Math.max(sum, max);
                end = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        // return sub array with max sum
        int[] res = new int[end - start + 1];
        for(int i = 0; i < res.length; i++)
        {
            res[i] = arr[start + i];
        }
        return res;
    }

}
