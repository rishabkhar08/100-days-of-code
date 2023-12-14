import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter name: ");  
            String name = sc.nextLine(); 

            System.out.print("Enter number: "); 
            int N = sc.nextInt();

            PrintNameNtimes(N, name);
         }
    }

    static int count = 0;
    public static void PrintNameNtimes(int N, String name){

        if(count == N)
        return;
        System.out.println(name);

        count++;
        PrintNameNtimes(N, name);
    }

}

