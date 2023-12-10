import java.util.Scanner;

public class Patterns19 {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            int spaces = 0;
            for(int i=1; i<=N; i++)
            {
                for(int j=N; j>=i; j--)
                {
                    System.out.print("* ");
                }

                for(int j=1; j<=spaces; j++)
                {
                    System.out.print("  ");
                }
                spaces+=2;
                for(int j=N; j>=i; j--)
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }

            spaces = 2*N;
            for(int i=1; i<=N; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                spaces-=2;
                for(int j=1; j<=spaces; j++)
                {
                    System.out.print("  ");
                }

                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }
    }
}
