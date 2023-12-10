import java.util.Scanner;

public class Patterns14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                int asciiCode = 65;
                for(int j=1; j<=i; j++)
                {
                    System.out.print((char)asciiCode + " ");
                    asciiCode++;
                }
                System.out.println("");
            }
        }
    }
}
