import java.util.Scanner;

public class Patterns7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                for(int j=N; j>=i; j--)
                {
                    System.out.print("  ");
                }

                for(int j=1; j<=i*2-1; j++)
                {
                    System.out.print("* ");
                }

                System.out.println("");

            }
        }
    }
    
}
