import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number: ");  
            int N = sc.nextInt();
            boolean check = true;
            
            if(N <= 1){
                check = false;
            }

            for(int i = 2; i <= Math.sqrt(N); i++)
            {
                if(N % i == 0){
                    check = false;
                }   
            }

            System.out.println( N + " is Prime Number = " + check);

    }
}
}
