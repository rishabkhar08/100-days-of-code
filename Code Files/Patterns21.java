import java.util.Scanner;

public class Patterns21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                for(int j=1; j<=N; j++)
                {
                    if(i == 1 || i == N || j == 1 || j == N)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println("");
            }
        }
    }
}
