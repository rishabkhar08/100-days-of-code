import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    public static void main(String[] args) {

        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        for (int i : findWordsContaining(words, x)) {
            System.out.print(i + " ");
        }
    }
    
    public static List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < words.length; i++)
        {
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
        
    }
}