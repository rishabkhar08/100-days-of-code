import java.util.*;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        for (int i : SuperiorElementsBrute(arr)) {
            System.out.print(i + " ");
        }

        System.out.println();
        arr = new int[] {1, 2, 3, 2};
        for (int i : SuperiorElementsOptimal(arr)) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> SuperiorElementsBrute(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++) 
        {
            boolean  isSuperior = true;

            for(int j = i+1; j < n; j++)
            {
                if(arr[j] >= arr[i]){
                    isSuperior = false;
                    break;
                }
            }
            
            if(isSuperior) {
                result.add(arr[i]);
            }

        }
        
        Collections.sort(result);
        return result;
    }

    static List<Integer> SuperiorElementsOptimal(int[] arr) {

        int n = arr.length;
        List<Integer> resList = new ArrayList<> ();
        int max = 0;

        for(int i = n - 1; i >= 0; i--)
        {
            if(arr[i] > max) {
            max = Math.max(max, arr[i]);
            resList.add(max);
            }
        }

        return resList;
    }

}
