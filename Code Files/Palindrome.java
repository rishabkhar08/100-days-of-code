import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int N = sc.nextInt();
            int rev = 0; 
            int temp = N;
            while(temp > 0){
                int a = temp % 10;
                rev = rev * 10 + a ;
                temp = temp / 10;
            }
            System.out.println("Palindrome Number = " + (N == rev ? true : false));
        }
    }
}