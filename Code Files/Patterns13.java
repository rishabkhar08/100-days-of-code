import java.util.Scanner;

public class Patterns13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            int temp = 1;
            for(int i=1; i<=N; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print(temp + " ");
                    temp++;
                }
                System.out.println("");
            }
        }
    }
}
