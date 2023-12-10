import java.util.Scanner;

public class Patterns22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            for(int i=1; i<=2*N-1; i++)
            {
                for(int j=1; j<=2*N-1; j++)
                {
                    int top = i;
                    int left = j;
                    int bottom = 2*N - i;
                    int right  = 2*N - j;

                    System.out.print(N+1 - Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
                }

                System.out.println("");
                }
            }
        }
    }
    
