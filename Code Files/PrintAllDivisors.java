import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number- ");  
            int N = sc.nextInt();
            List<Integer> divisors = new ArrayList<>();
            // easy approach but not the best 
            // for(int i=1; i<=N; i++)
            // {
            //   if(N % i == 0){
            //     divisors.add(i);
            //   }
            // }
            
            // optimal approach 
            int n = (int) Math.sqrt(N);
            for(int i = 1; i <= n ; i++){

                if(N%i == 0){
                    divisors.add(i);
                    if(N/i != i){
                        divisors.add(N/i);
                    }
                }
            }
            Collections.sort(divisors);
            System.out.println(N +" is Divided by = " + divisors);
        }
    }
}
