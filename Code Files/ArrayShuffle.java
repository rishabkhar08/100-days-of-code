public class ArrayShuffle {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        for (int i : Shuffle(arr, n)) {
            System.out.print(i + " ");
        }
    }

    public static int[] Shuffle (int[] arr, int n)
    {
        int[] res = new int[2*n];
        int i = 0, j = n;
        for (int k = 0; k < 2 * n; k += 2) 
        {
            res[k] = arr[i++];
            res[k + 1] = arr[j++];
        }

        return res;
    }
}