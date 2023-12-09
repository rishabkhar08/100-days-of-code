import java.util.Scanner;

public class Patterns3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);      
        System.out.print("Enter number- ");  
        int N = sc.nextInt();
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");5
            }
            System.out.println("");
        }
    }
}
