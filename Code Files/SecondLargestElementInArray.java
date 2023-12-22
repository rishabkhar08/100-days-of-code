public class SecondLargestElementInArray {
    public static void main(String[] args) {

        int arr[] = { 3, 8, 10, 5, 7, 9 };
        int max = arr[0];
        int smax = 0 ;

        for(int i=0; i < arr.length; i++){

            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
