import java.util.*;
public class selectionSort {
    public static void printArr(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }  
        System.out.println();
    }

//selection sort
    //O(n^2)
    public static void SelectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        printArr(numbers);
    }

    public static void main(String[] args) {
        int[] arr= {3,5,1,2,4};
        SelectionSort(arr);
        
        Arrays.sort(arr,0,arr.length); printArr(arr);
        }
}