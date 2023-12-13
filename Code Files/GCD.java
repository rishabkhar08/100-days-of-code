import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int N1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            int N2 = sc.nextInt();

            System.out.println("GCD = " + FindGCD(N1,N2));
        }
    }

    public static int FindGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return FindGCD(b, a%b);
    }
}