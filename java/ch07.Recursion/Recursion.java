public class Recursion {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.print(n);
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if(n == 1 || n == 0) {
            return 1; 
        }
        int a = factorial(n-1);
        return n*a;

    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
    
    public static int fib(int n) {
        if(n == 1 || n == 0) {
            return n; 
        }
        return fib(n-1) + fib(n-2);
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] <= arr [i+1] && isSorted(arr,i+1) == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // printDec(5);
        // printInc(5);
        // System.out.println();
        // System.out.println(factorial(5));
        // System.out.println(sum(5));
        // System.out.println(fib(5));
        int[] arr = {1,1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
