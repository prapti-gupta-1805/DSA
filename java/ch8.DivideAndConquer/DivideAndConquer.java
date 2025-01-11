public class DivideAndConquer{

    // Utility method to print arrays
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort Methods
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    // Quick Sort Methods
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
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

    // Rotated Sorted Array Search Method
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Merge Sort Example
        int arr1[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Original Array for Merge Sort:");
        printArr(arr1);
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted Array after Merge Sort:");
        printArr(arr1);

        // Quick Sort Example
        int arr2[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Original Array for Quick Sort:");
        printArr(arr2);
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted Array after Quick Sort:");
        printArr(arr2);

        // Rotated Sorted Array Search Example
        int arr3[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println("Searching for " + target + " in Rotated Sorted Array:");
        int result = search(arr3, target, 0, arr3.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
