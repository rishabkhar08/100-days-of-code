import java.util.Scanner;

public class Recursion4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number: "); 
            int N = sc.nextInt();

            SumOfFirstN(N);
        }
    }

    static int count = 0;
    static int sum = 0;
    public static void SumOfFirstN(int N){

        if(count == N){
        System.out.println(sum);
        return;
        }
        
        count++;
        sum = sum + count;
        SumOfFirstN(N);

    }
}
