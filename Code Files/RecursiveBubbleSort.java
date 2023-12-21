
public class RecursiveBubbleSort {
    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};
        
        BubbleSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void BubbleSort(int[] arr, int n){
        if(n <= 1) return;                       // Base case

        for(int i = 0; i < n - 1; i++){
            if(arr[i+1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        BubbleSort(arr,n-1);                    //Recursive case
    }
}