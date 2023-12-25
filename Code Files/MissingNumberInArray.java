
public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 6, 3, 7, 8 };
        int n = arr.length + 1; // Expected size of the array
        int missingNumber ;
        // missingNumber = findMissingNumber(arr, n);
        // missingNumber = findMissingNumberXOR(arr, n);
        missingNumber = findMissingNumberHashing(arr, n);
        System.out.println("Missing number : " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n){

        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;
        for (int i : arr) {
            actualSum+= i;
        }
        return expectedSum - actualSum;
    }

    public static int findMissingNumberXOR(int[] arr, int n){

        int xor1 = 0, xor2 = 0;

        for(int i=0; i < n - 1; i++ )
        {
            xor1 = xor1 ^ i+1;
            xor2 = xor2 ^ arr[i];
        }
        xor1 = xor1 ^ n;

        return xor1^xor2;
    }

    public static int findMissingNumberHashing(int[] arr, int n){

        int max = arr[0];
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] hash = new int[max+1];

        for(int i=0; i < n - 1; i++)
        {
            hash[arr[i]]++;
        }

        for(int j=1; j <= max; j++)
        {
            if(hash[j] == 0){
                return j;
            }
        }

        return -1;
    }
}
