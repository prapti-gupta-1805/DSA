package SortingAlgorithms;
import java.util.*;
public class sorting {
    public static void printArr(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }  
        System.out.println();
    }

//bubble sort
    //O(n^2)
    public static void bubbleSort(int[] numbers) {
        for (int i=0; i<numbers.length;i++) {
            for (int j=0; j<numbers.length-1-i; j++){
                if (numbers[j]>numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        printArr(numbers);
    }

//selection sort
    //O(n^2)
    public static void selectionSort(int[] numbers) {
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

//insertion sort
    //0(n^2)
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int curr = numbers[i];
            int prev = i - 1;
            while (prev >= 0 && numbers[prev] > curr) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = curr;
        }
        printArr(numbers);
    }
    
//inbuilt sort
    //0(n logn)
        //syntax: Arrays.sort(arr); or Arrays.sort(arr,si,ei(not included))
    //reverse order (works on Objects not int)
        //Arrays.sort(arr, 0, arr.length, Collections.reverseOrder());
    public static void main(String[] args) {
        int[] arr= {3,5,1,2,4};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        Arrays.sort(arr,0,arr.length); printArr(arr);
        }
}