import java.util.Scanner;

public class Recursion5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number: "); 
            int N = sc.nextInt();

           int factorial = Factorial(N);
           System.out.println(factorial);
        }
    }

    public static int Factorial(int N){

        if(N == 0)
        return 1;

        return N*Factorial(N-1);
    }

}
