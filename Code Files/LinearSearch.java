public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 3;

        System.out.println(FindIndexOfNumber(arr,num));
    }

    public static int FindIndexOfNumber(int[] arr, int num){

        int n = arr.length;
        for(int i=0; i < n; i++)
        {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
