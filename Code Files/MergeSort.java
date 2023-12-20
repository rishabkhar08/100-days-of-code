import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        int n = arr.length;

        Merge_Sort(arr, 0, n-1);
        
        // Print the sorted array after the merge sort
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void Merge_Sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;

        Merge_Sort(arr, low, mid);       // left 
        Merge_Sort(arr, mid + 1, high);  // right
        Merge(arr, low, mid, high);      // merging both left & right after sorting
    }

    public static void Merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        int leftArrStartIndex = low;
        int rightArrStartIndex = mid + 1;

        while (leftArrStartIndex <= mid && rightArrStartIndex <= high) {
            if (arr[leftArrStartIndex] <= arr[rightArrStartIndex]) {
                sortedArray.add(arr[leftArrStartIndex]);
                leftArrStartIndex++;
            } else {
                sortedArray.add(arr[rightArrStartIndex]);
                rightArrStartIndex++;
            }
        }

        // if elements on the left half are still left
        while (leftArrStartIndex <= mid) {
            sortedArray.add(arr[leftArrStartIndex]);
            leftArrStartIndex++;
        }

        // if elements on the right half are still left
        while (rightArrStartIndex <= high) {
            sortedArray.add(arr[rightArrStartIndex]);
            rightArrStartIndex++;
        }

        // Copy the sorted elements back to the original array
        int i = low;
        for (int num : sortedArray) {
            arr[i++] = num;
        }
    }
}
