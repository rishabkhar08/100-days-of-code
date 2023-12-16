import java.util.Scanner;

public class Recursion8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: "); 
            int N = sc.nextInt();

            System.out.println("Fibonacci Number at " + N + " : " + FibonacciNumber(N));

            System.out.print("Fibonacci Series up to " + N + " : ");
            for (int i = 0; i <= N; i++) {
                System.out.print(FibonacciNumber(i) + " ");
            }
        }
    }

    public static int FibonacciNumber(int n){

        if(n == 0){
            return 0;
        }
        if(n <= 1){
            return 1;
        }
        int last = FibonacciNumber(n-1);
        int slast = FibonacciNumber(n-2);

        return last + slast;
    }
}
