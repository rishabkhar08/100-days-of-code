import java.util.Scanner;

public class Hashing1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: "); 
            int N = sc.nextInt();
            int arr[] = new int[N]; 

            for(int i = 0; i < N; i++)
            {
                System.out.print("Enter element " + i + " : "); 
                arr[i] = sc.nextInt();
            }

            // precompute
            int hash[] = new int[N*2]; 
            for(int i = 0; i < N; i++)
            {
                hash[arr[i]] += 1;
            }

            //fetch
            System.out.print("Enter number: ");
            int m = sc.nextInt();
            int chkArr[] = new int[m]; 
            for(int i = 0; i < m; i++)
            {
                System.out.print("Enter element to check" + i + " : "); 
                chkArr[i] = sc.nextInt();
            }

            while (m > 0) {
                System.out.println( chkArr[m-1] + " : "+ hash[chkArr[m-1]] );
                m--;
            }
            
        }
    }
}
