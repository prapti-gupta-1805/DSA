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
        changeArr(arr, i+1,val+1); //fn call
        arr[i] -= 2; //backtracking step
    }

    public static void findSubsets(String str, String s, int i) {
        //base case
        if(i == str.length()) {
            if (s.length() == 0) {
                System.out.println(".");
            } else {
                System.out.println(s);
            }
        return;
        }
        //recursion
        //yes choice
        findSubsets(str,s+str.charAt(i),i+1);
        //no choice
        findSubsets(str,s,i+1);
    }

    
    public static void main(String args[]) {
        int arr[]= new int[5];

        //simple depiction of backtracking
        changeArr(arr, 0, 1);
        printArr(arr);
        String str = "abc";
        findSubsets(str,"",0);
    }
}
