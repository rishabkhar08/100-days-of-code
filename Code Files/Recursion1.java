import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {    
         try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number: ");  
            int N = sc.nextInt();
            PrintAllNumbers(N);
         }
    }
    
    static int count = 1;
    public static void PrintAllNumbers(int N){
        if(count > N) return;
        System.out.println(count);

        count++;
        PrintAllNumbers(N);
    }
}
