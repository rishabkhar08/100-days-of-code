import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        System.out.println(FindMajorityElementBrute(arr));

        arr = new int[] { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        System.out.println(FindMajorityElementHashMap(arr));

        arr = new int[] { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        System.out.println(FindMajorityElementOptimal(arr));
    }

    static int FindMajorityElementBrute(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > n / 2) {
                res = arr[i];
            }
        }
        return res;
    }

    static int FindMajorityElementHashMap(int[] arr) {
        int n = arr.length;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) 
        {
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if (entry.getValue() > n / 2) {
                res = entry.getKey();
            }
        }

        return res;
    }

    static int FindMajorityElementOptimal(int[] arr) {
        // Moore’s Voting Algorithm

        int n = arr.length;
        int res = 0, cnt = 0, v = 0;

        //Find the majority element and store it in a variable
        for(int i = 0; i < n; i++)
        {
            if(cnt == 0){
                cnt = 1;
                v = arr[i];
            }
            else if (arr[i] == v) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        // Check if the varibale has a count > n/2 
        cnt  = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == v){
                cnt++;
            }
            if(cnt > n/2){
                res = arr[i];
            }
        }

        return res;
    }
}