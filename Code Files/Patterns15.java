import java.util.Scanner;

public class Patterns15 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                int asciiCode = 65;
                for(int j=N; j>=i; j--)
                {
                    System.out.print((char)asciiCode + " ");
                    asciiCode++;
                }
                System.out.println("");
            }
        }
    }
}
