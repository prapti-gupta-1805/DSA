import java.util.*;

public class TrappingRainwater {
    public static int trap(int[] height) {
        int leftMaxHeight[] = new int[height.length];
        int rightMaxHeight[] = new int[height.length];
        int n = height.length;

        leftMaxHeight[0] = height[0];
        for (int i = 1; i < n; i++) {
            if (leftMaxHeight[i - 1] > height[i]) {
                leftMaxHeight[i] = leftMaxHeight[i - 1];
            } else {
                leftMaxHeight[i] = height[i];
            }
        }

        rightMaxHeight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (rightMaxHeight[i + 1] > height[i]) {
                rightMaxHeight[i] = rightMaxHeight[i + 1];
            } else {
                rightMaxHeight[i] = height[i];
            }
        }

        int totalTrappedRainwater = 0;
        for (int i = 0; i < n; i++) {
            totalTrappedRainwater += Math.min(leftMaxHeight[i], rightMaxHeight[i]) - height[i];
        }
        
        return totalTrappedRainwater;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bars: ");
        int N = sc.nextInt();
        int height[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter bar height: ");
            height[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(height[i] + " ");
        }
        
        System.out.println();
        
        System.out.println(trap(height));

        sc.close();
    }
}