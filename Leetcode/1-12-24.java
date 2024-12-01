/* Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
*/
import java.util.*;

class Solution {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                if (i != j && 0 <= i && j <=arr.length && (a == 2*b || b == 2*a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int N = sc.nextInt();

        if (N >= 2 && N <= 500) {
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Enter element: ");
                int A = sc.nextInt();
                if (A >= -Math.pow(10, 3) && A <= Math.pow(10, 3)) {
                    arr[i] = A;
                }
            }
            boolean result = checkIfExist(arr);
            System.out.println(result ? "True" : "False");
        } else {
            System.out.println("Error.");
        }
    }
}
