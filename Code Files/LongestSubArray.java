public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int k = 10;

        int res = FindLongestSubArray( arr, k);
        System.out.print("Length of longest SubArray : " + res );
    }

    public static int FindLongestSubArray(int[] arr, int k){

        int n = arr.length;
        int length = 0;
        for(int i=0; i < n; i++)
        {
            int sum = 0;
            for(int j=i; j < n; j++)
            {
                sum = sum + arr[j];
                if(sum == k){
                    length = Math.max(length, j - i + 1);
                }    
            }
        }

        return length;
    }
}
