public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 5, 3, 9, 4, 7, 6, 1 };

        Quick_Sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void Quick_Sort(int[] arr, int i, int n) {

        if (n <= i)
            return;                                                         // Base case

        int pivot = Partition(arr, i, n);
        Quick_Sort(arr, i, pivot - 1);                                      // Recursive cases
        Quick_Sort(arr, pivot + 1, n);
    }

    public static int Partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }
}
