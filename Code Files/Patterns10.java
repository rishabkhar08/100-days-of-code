import java.util.Scanner;

public class Patterns10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=2*N-1; i++)
            {
                int k = i > N ? 2*N -i : i;
                for(int j=1; j<=k; j++)
                {
                    System.out.print("* ");
                }

                System.out.println("");
            }

        }
    }
    
}
