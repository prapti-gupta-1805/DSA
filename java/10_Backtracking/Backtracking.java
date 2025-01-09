package 10_Backtracking;

public class Backtracking {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val) {
        //base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeAree(arr, i+1,val+1);
        arr[i] -= 2;
    }


    public static void main(String args[]) {
        int arr[]= new int[5];

        //simple depiction of backtracking
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
