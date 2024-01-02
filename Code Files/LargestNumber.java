public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println("Largest Number : " + GetLargestNumber(arr));
    }

    public static int GetLargestNumber(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = gain[i - 1] + arr[i - 1];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}