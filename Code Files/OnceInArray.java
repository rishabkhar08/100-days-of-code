public class OnceInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 4};

        int num = FindNumberOnceInArray(arr);
        System.out.print(num);
    }

    public static int FindNumberOnceInArray(int[] arr){

        int n = arr.length;
        int num = 0;
    
        for(int i=0; i < n; i++)
        {
            num = num ^ arr[i];
        }

        return num;

    }

}
