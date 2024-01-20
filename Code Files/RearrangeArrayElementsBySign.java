import java.util.*;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5 };

        for (int i : RearrangeBrute(arr)) {
            System.out.print(i + " ");
        }

        arr = new int[] { 1, 2, -4, -5 };
        System.out.println();
        for (int i : RearrangeBruteUsingArrayList(arr)) {
            System.out.print(i + " ");
        }

        arr = new int[] { 1, 2, -4, -5 };
        System.out.println();
        for (int i : RearrangeBruteOptimal(arr)) {
            System.out.print(i + " ");
        }
    }

    static int[] RearrangeBrute(int[] arr) {
        int N = arr.length;
        int[] pos = new int[N / 2];
        int[] nev = new int[N / 2];
        int n = 0, p = 0;
        for (int i = 0; i < N; i++) 
        {
            if (arr[i] > 0) {
                pos[p] = arr[i];
                p++;
            } else {
                nev[n] = arr[i];
                n++;
            }
        }

        p = 0;
        n = 0;
        for (int i = 0; i < N; i++) 
        {
            if (i % 2 == 0) {
                arr[i] = pos[p];
                p++;
            } else {
                arr[i] = nev[n];
                n++;
            }

        }

        return arr;
    }

    static int[] RearrangeBruteUsingArrayList(int[] arr) {
        int n = arr.length;
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > 0) {
                posList.add(arr[i]);
            } else {
                negList.add(arr[i]);
            }
        }

        for (int i = 0; i < n / 2; i++) 
        {
            arr[2 * i] = posList.get(i);
            arr[2 * i + 1] = negList.get(i);
        }

        return arr;
    }

    static int[] RearrangeBruteOptimal(int[] arr) {
        int n = arr.length;
        int[] resArr = new int[n];
        int posStart = 0;
        int negStart = 1;

        for (int i : arr) 
        {
            if (i > 0) {
                resArr[posStart] = i;
                posStart = posStart + 2;
            } else {
                resArr[negStart] = i;
                negStart = negStart + 2;
            }
        }
        return resArr;
    }
}
