public class IsArraySortedAndRotated {
    public static void main(String[] args) {
        int arr[] =  { 4, 5, 1, 2, 3 };
        boolean check = Is_ArraySorted(arr);
        System.out.println(check);
    }

    public static boolean Is_ArraySorted(int[] arr){

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > arr[(i + 1) % n]) {
                ++count;
            }
            
            if(count > 1){
                return false;
            }
        }

        return true;
    }
}
