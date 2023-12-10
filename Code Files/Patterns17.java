import java.util.Scanner;

public class Patterns17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                int asciiCode = 65;
                for(int j=N; j>=i+1; j--)
                {
                    System.out.print("  ");
                }

                for(int j=1; j<=i; j++)
                {
                    System.out.print((char)asciiCode + " ");
                    asciiCode++;
                }
                for(int j=i-1; j>=1; j--)
                {
                    asciiCode = 65;
                    asciiCode = asciiCode+j-1;
                    System.out.print((char)asciiCode + " ");
                }
                System.out.println("");
            }
        }
    }
}
