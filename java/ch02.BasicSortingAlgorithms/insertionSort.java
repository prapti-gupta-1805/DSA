public class insertionSort {
    public static void printArr(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }  
        System.out.println();
    }
    
//insertion sort
    //0(n^2)
    public static void InsertionSort(int[] numbers) {
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
    
    public static void main(String[] args) {
        int[] arr= {3,5,1,2,4};
        InsertionSort(arr);
    }
}
