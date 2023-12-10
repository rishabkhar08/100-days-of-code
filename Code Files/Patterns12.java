import java.util.Scanner;

public class Patterns12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print(j + " ");
                }

                for(int j=i*2; j<N*2; j++)
                {
                    System.out.print("  ");
                }

                 for(int j=i; j>=1; j--)
                {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }

        }
    }
    
}
