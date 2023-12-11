import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int N = sc.nextInt();
            int rev = 0; 
            while(N > 0){
                int a = N % 10;
                rev = rev * 10 + a ;
                N = N / 10;
            }
            System.out.println("Reversed Number = " + rev);
        }
    }
}
