public class countingSort {
    public static void printArr(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }  
        System.out.println();
    }

    
//counting sort
    //O(max(n,range))
    public static void CountingSort(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int[] freq = new int[max - min + 1];
        for (int i = 0; i < numbers.length; i++) {
            freq[numbers[i] - min]++;

        }
    
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                numbers[index++] = i + min;
                freq[i]--;
            }
        }

        printArr(numbers);
    }

    public static void main(String[] args) {
        int[] arr= {3,5,1,2,4};
        CountingSort(arr);
    }
}
