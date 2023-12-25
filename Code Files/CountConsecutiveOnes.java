public class CountConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1, 0, 1};
        int countOnes = CountOnes(arr);
        System.out.println("Consecutive One in array : " + countOnes);
    }

    public static int CountOnes(int[] arr){

        int n = arr.length;
        int count = 0, temp =0;
        for(int i=0; i < n; i++)
        {
            if(arr[i] == 1)
            {
                count++;
                if(count > temp)
                {
                    temp = count;
                }
            }
            else
            {
                count = 0;
            } 
        }
        
        return temp;
    }
}