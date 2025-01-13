import java.util.Arrays;

public class inbuiltSort {
    public static void printArr(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }  
        System.out.println();
    }

    //inbuilt sort
    //0(n logn)
        //syntax: Arrays.sort(arr); or Arrays.sort(arr,si,ei(not included))
    //reverse order (works on Objects not int)
        //Arrays.sort(arr, 0, arr.length, Collections.reverseOrder());
    
     public static void main(String[] args) {
        int[] arr= {3,5,1,2,4};
        Arrays.sort(arr,0,arr.length);
        printArr(arr);
}
}
