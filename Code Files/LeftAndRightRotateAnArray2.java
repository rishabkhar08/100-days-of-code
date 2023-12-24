public class LeftAndRightRotateAnArray2 {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 9, 3, 11, 6 };
        int n = arr.length;
        int r = 2;

        System.out.print("Orginal Array : ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();

        LeftRotate(arr,n,r);
        System.out.print("Left Rotate by " + r + " : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }


        arr = new int[] { 4, 2, 9, 3, 11, 6 };

        RightRotate(arr, n, r);
        System.out.println();
        System.out.print("Right Rotate by " + r + " : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void LeftRotate(int[] arr, int n, int r) {

        ReverseArray(arr, 0, n-1);           // Reverse entire array
        ReverseArray(arr, 0, n-r-1);         // Reverse array 0 to n - r - 1
        ReverseArray(arr, n-r, n-1);           // Reverse array n - r to n
    }

    public static void RightRotate(int[] arr, int n, int r) {

        ReverseArray(arr, 0, n-1);           // Reverse entire array
        ReverseArray(arr, r, n-1);             // Reverse array r to n - 1
        ReverseArray(arr, 0, r-1);           // Reverse array 0 to r - 1
    }

    public static void ReverseArray(int[] arr, int s, int e) {

        while (s < e) {
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++; e--;                   // 2 pointers one from start and one from end of an array.
        }
    }
}
