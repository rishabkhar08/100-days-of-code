import java.util.Scanner;

public class Recursion7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter String : ");
            String text = sc.nextLine();

            System.out.println("Palindrome : "+ PalindromeCheck(0,text)); 
        }
    }

    public static boolean PalindromeCheck(int i, String text){

        if(i > text.length()/2){
            return true;
        }

        if(text.charAt(i) != text.charAt(text.length() - i - 1)){
            return false;
        }

        return PalindromeCheck(i+1, text);
    }
}
