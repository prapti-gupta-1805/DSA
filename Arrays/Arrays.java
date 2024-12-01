import java.util.*;

public class Arrays {
    // Linear search method
    public static void linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }
        System.out.println("Key not found");
    }

    //smallest and largest number
    public static void smallest_largest(int numbers[]) {
        int largest= Integer.MIN_VALUE; //Integer.MIN_VALUE = -infinity
        int smallest= Integer.MAX_VALUE; //+infinity
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]>largest) {
                largest=numbers[i];
            }
            if (numbers[i]<smallest) {
                smallest=numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }

    // Binary Search
    // Prerequisite: Sorted array
    //time: O(log n)
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid; // Key found at index mid
            }
            if (numbers[mid] < key) { // Search in the right half
                start = mid + 1;
            } else { // Search in the left half
                end = mid - 1;
            }
        }
        return -1; // Key not found
    }

    //reverse an array
    //time: O(n)
    //space: O(1)
    public static void reverse(int numbers[]) {
        int first=0, last = numbers.length-1;
        while(first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        System.out.print("Reversed array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
    //pairing in array
    public static void pairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.printf("(%d, %d) ", numbers[i], numbers[j]);
            }
            System.out.println();
        }
    }

    //subarrays
    public static void subarrays(int[] numbers) {
        int ts=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for(int k=i;k<=j; k++) {
                    System.out.print(" " + numbers[k] + " ");
                }
                System.out.print("|");
                ts++;
            }
            System.out.println();
        }
        System.out.println("total subarrays= " + ts );
    }

    //Max subarray sum
    //Brute force
    //time complexity = O(n^3)
    //Prefix method
    //time complexity = 
    public static void prefixMaxSubarraySum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int len = numbers.length;
        int prefix[] = new int[len];
        prefix[0]=numbers[0];
        for (int i=1; i<numbers.length; i++) {
            prefix[i] = numbers[i] + prefix[i-1];
            }

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i; j < numbers.length; j++) {
                    int currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                    if(maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
            }
        System.out.println("Maximum subarray sum = " + maxSum);
    }
        
    

    public static void main(String[] args) {
    
        // Array creation
        //int[] arr = new int[1];
        int numbers[]= {1,2,3,4,5};
        // Input
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3]; 
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
        
        System.out.println("Length of the array: " + marks.length); // Print length of array

        // Array passed as parameter in the function
        // System.out.print("Enter the key to linear search (on marks[]): "); 
        // int key = sc.nextInt();
        // linearSearch(marks, key);
        // smallest_largest(marks);

        // System.out.print("Enter the key to binary search (on numbers[]): "); 
        // int key1 = sc.nextInt();
        // System.out.println("your key was found at index  " + binarySearch(numbers, key1));

        // reverse(numbers);
        // pairs(numbers);
        // subarrays(numbers);
        prefixMaxSubarraySum(numbers);
    }
}
