import java.util.*;
class Patterns1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=N; i++)
            {
                for(int j=1; j<=N; j++)
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
}