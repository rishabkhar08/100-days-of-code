import java.util.Scanner;

public class Patterns6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                for(int j=1; j<=N-i+1; j++)
                {
                    System.out.print(j +" ");
                }
                System.out.println("");
            }
        }
    }
}
