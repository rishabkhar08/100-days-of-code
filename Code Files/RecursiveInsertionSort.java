public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        
        InsertionSort(arr,arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void InsertionSort(int[] arr, int n){
        if (n <= 1)
            return;                         // Base case

        InsertionSort(arr, n - 1);          // Recursive call

        int lastElement = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > lastElement) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = lastElement;
    }
}
