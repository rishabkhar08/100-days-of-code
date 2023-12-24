import java.util.*;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };
         
        ArrayList<Integer> resArr = Union(arr1, arr2);
        for (int i : resArr) {
            System.out.print(i +" ");
        }

    }

    public static ArrayList<Integer> Union(int[] arr1, int[] arr2){

        ArrayList<Integer> union = new ArrayList<>();
        int i=0, j=0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                if(union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                {
                    union.add(arr1[i]);
                }
                i++;
            }
            else
            {
                if(union.size() == 0 || union.get(union.size() - 1)  != arr2[j]) 
                {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < arr1.length)                                         // if any elements left in arr1
        {
            if(union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                {
                    union.add(arr1[i]);
                }
            i++;
        }
        while (j < arr2.length)                                         // if any elements left in arr2
        {
            if(union.size() == 0 || union.get(union.size() - 1)  != arr2[j]) 
                {
                    union.add(arr2[j]);
                }
            j++; 
        }

        return union;
    }
}
