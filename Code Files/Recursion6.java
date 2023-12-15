import java.util.Scanner;

public class Recursion6 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Array Size: ");       
            int N = sc.nextInt();

            int array[] = new int[N];
            for(int i = 0; i < N; i++)
            {
                System.out.print("element " + i + ": " );
                array[i] = sc.nextInt();
            }

            int revArray[]= ReverseAnArray(array,0,N-1);
            for (int i : revArray) {
                System.out.print(i + " ");
            } 

        } 
    }

    public static int[] ReverseAnArray(int array[], int s, int e){

        if(s < e)
        {
            int temp = array[s];
            array[s] = array[e];
            array[e] = temp;
            ReverseAnArray(array, s+1, e-1);
        }
        return array;
    }

}
