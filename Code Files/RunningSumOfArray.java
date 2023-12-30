public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i : RunningSum(arr)) 
        {
            System.out.print(i + " ");
        }
    }

    public static int[] RunningSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
}