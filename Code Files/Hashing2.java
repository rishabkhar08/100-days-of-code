import java.util.Scanner;

public class Hashing2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: "); 
            String s = sc.next();
            char ch[] = s.toCharArray();

            //precompute
            int hash[] = new int[26];
            for(int i = 0; i < s.length(); i++){
                hash[ch[i] - 'a']++; 
            }

            //fetch
            System.out.print("Char check : ");
            String chkStr = sc.next();
            char chkChar[] = chkStr.toCharArray();

            for(int i = 0; i < chkStr.length(); i++){
                 System.out.println(chkChar[i] + " : " + hash[chkChar[i] - 'a'] ); 
            }
            

        } 
    }
}
