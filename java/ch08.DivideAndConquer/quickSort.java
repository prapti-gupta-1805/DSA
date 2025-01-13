public class quickSort {
    // Utility method to print arrays
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void QuickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(arr, si, ei);
        QuickSort(arr, si, pidx - 1);
        QuickSort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int piv = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= piv) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr2[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Original Array for Quick Sort:");
        printArr(arr2);
        QuickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted Array after Quick Sort:");
        printArr(arr2);
    }
}
