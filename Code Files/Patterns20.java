import java.util.Scanner;

public class Patterns20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            int spaces = 2*N - 2 ;
            for(int i=1; i<=2*N-1; i++)
            {
                int k = i > N ? 2 * N - i : i; 
                for(int j=1; j<=k; j++)
                {
                    System.out.print("* ");
                }

                for(int j=1; j<=spaces; j++)
                {
                    System.out.print("  ");
                }

                for(int j=1; j<=k; j++)
                {
                    System.out.print("* ");
                }

                if(i < N) spaces-= 2;  
                else spaces+=2;

                System.out.println("");
            }
        }
    }
}
