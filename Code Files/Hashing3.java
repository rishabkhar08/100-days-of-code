import java.util.*;

public class Hashing3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Enter element " + i + " : ");
                arr[i] = sc.nextInt();
            }
            Frequency(arr, N);
        }
    }

    public static void Frequency(int arr[], int n){

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        //precompute
        for(int i =0; i < n; i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxElmnt = 0, minElmnt = 0; 

        //fetch
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxFreq){
                maxFreq = count;
                maxElmnt = element; 
            }

            if(count < minFreq){
                minFreq = count;
                minElmnt = element; 
            }
        }

        System.out.println("Highest frequency element : " + maxElmnt + " | Frequency : " + maxFreq );
        System.out.println("Lowest frequency element : " + minElmnt + " | Frequency : " + minFreq );
    }
}
