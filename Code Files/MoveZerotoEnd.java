
public class MoveZerotoEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 0, 4, 0};
        int n = arr.length;
        int nonZeroIndex = 0;
        
        for(int i=0; i < n; i++)
        {
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex < n)
        {
            arr[nonZeroIndex++] = 0;
        }

        for (int i : arr) 
        {
            System.out.print(i +" ");
        }
    }
}
