import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");  
            int N = sc.nextInt();
            int sum = 0;
            int temp = N;
            int count = 0;
            int n = N;
            
            while(n > 0){
                count++;
                n = n / 10;
            }

            while (N > 0) {
                int lastDigit = N % 10;
                sum = (int) (sum + (Math.pow(lastDigit,count)));
                N = N / 10;
            }

            // Separate the boolean check and the sum in the output
            System.out.println("Armstrong Number = " + (sum == temp));
        }
    }
}
