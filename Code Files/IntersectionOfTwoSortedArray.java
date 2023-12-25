import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {

        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };

        ArrayList<Integer> resArrayList = Intersection( arr1, arr2);
        for (int i : resArrayList) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2){

        ArrayList<Integer> intersection = new ArrayList<>();

        int i=0, j=0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else if( arr2[j] < arr1[i])
            {
                j++;
            }
            else
            {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersection;
    }
}
