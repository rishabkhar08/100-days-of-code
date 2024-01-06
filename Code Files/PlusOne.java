public class PlusOne {
    public static void main(String[] args) {
        int[] arr1 = { 4, 3, 2, 1 };
        int[] arr2 = { 1, 2, 9, 9 };

        for (int i : PlusOneToArray(arr1)) 
        {
            System.out.print(i +" ");
        }
        System.out.println();
        for (int j : PlusOneToArray(arr2)) 
        {
            System.out.print(j +" ");
        }
    }

    public static int[] PlusOneToArray(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[n + 1];
        result[0] = 1;

        for (int i = 1; i <= n; i++) {
            result[i] = digits[i - 1];
        }

        return result;
    }
}
