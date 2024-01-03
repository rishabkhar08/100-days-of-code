public class FindEvenDigitNumbers {
    public static void main(String[] args) {
        int arr[] = { 12, 345, 2, 6, 7896 };

        System.out.println("Even digit numbers in array are :" + FindNumbers(arr));
    }

    public static int FindNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                cnt++;
            }
            if (cnt % 2 == 0)
                count++;
        }
        return count;
    }
}
