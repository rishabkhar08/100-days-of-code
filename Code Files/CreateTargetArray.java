import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        for (int i : createTargetArray(arr,index)) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> createTargetArray(int[] arr, int[] index) {

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(index[i], arr[i]);
        }
        return arrList;

    }
}