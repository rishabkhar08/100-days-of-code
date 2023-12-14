import java.util.Scanner;

public class Recursion3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number: "); 
            int N = sc.nextInt();

            PrintNtoOne(N);
        }
    }

    public static void PrintNtoOne(int N){

        if( N < 1 )
        return;
        System.out.println(N);

        N--;
        PrintNtoOne(N);
    }



}
