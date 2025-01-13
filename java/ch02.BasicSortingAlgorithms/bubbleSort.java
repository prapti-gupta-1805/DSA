public class bubbleSort {
    public static void printArr(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }  
        System.out.println();
    }

    //bubble sort
    //O(n^2)
    public static void BubbleSort(int[] numbers) {
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
    public static void main(String[] args) {
        int[] arr= {3,5,1,2,4};
        BubbleSort(arr);
    }
}
