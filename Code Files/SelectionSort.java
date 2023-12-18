
public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = new int[] { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        int min;
        for(int i = 0; i < n - 1; i++)
        {
            min = i;
            for(int j = i+1; j < n ; j++)
            {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // swapping
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
