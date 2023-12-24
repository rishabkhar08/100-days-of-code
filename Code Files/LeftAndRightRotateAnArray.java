public class LeftAndRightRotateAnArray {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 9, 3, 11, 6};
        int n = arr.length;
        int r = 2;

        System.out.print("Orginal Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Left Rotate by " + r + " : ");
        for (int i : LeftRotate(arr, n, r)) 
        {
            System.out.print(i + " ");
        }

        arr = new int[] { 4, 2, 9, 3, 11, 6};
        System.out.println();
        System.out.print("Right Rotate by " + r + " : ");
        for (int j : RightRotate(arr, n, r)) 
        {
            System.out.print(j + " ");
        }

    }

    public static int[] LeftRotate (int[] arr, int n, int r) {

        int[] temp = new int[r];

        // copy the r elements to a temp array
        for(int i=0; i < r; i++)
        {
            temp[i] = arr[i];
        }

        // shift the remaining elements to the left
        for(int j=r; j < n ; j++)
        {
            arr[j-r] = arr[j];
        }

        // copy the temporary array back to the last of the array
        for(int k= n-r; k < n; k++)
        {
            arr[k] = temp[k - (n - r)];
        }

        return arr;
    }

    public static int[] RightRotate (int[] arr, int n, int r) {

        int[] temp = new int[r];

        // copy the r elements to a temp array
        for(int i=0; i < r; i++)
        {
            temp[i] = arr[i + n-r];
        }

        // shift the remaining elements to the right
        for(int j=n-1; j >= r; j--)
        {
            arr[j] = arr[j-r];
        }

        // copy the temporary array back to the beginning of the array
        for(int k=0; k < r; k++)
        {
            arr[k] = temp[k];
        }
        return arr;
    }    

}
