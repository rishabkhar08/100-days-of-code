import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int N = sc.nextInt();
            int digitCount = 0; 
            while(N > 0){
                N = N/10;
                digitCount++;
            }
            System.out.println("DigitCount = " + digitCount);
        }
    }
}