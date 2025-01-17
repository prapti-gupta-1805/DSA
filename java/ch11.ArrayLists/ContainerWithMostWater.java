import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1); height.add(8); height.add(6); height.add(2); height.add(5); height.add(4); height.add(8); height.add(3); height.add(7);

        System.out.println("ArrayList contents: ");
        for (int i = 0; i < height.size(); i++) {
            System.out.print(height.get(i) + " ");
        }
        System.out.println();
    
    //brute force - O(n^2)
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int area = ht * width;
                
                if (area > max) {
                    max = area;
                }
            }
        }
        System.out.println("Max water stored: " + max);

    //2 pointer approach - O(n)
        int lp = 0;
        int rp = height.size() - 1;
        int maxArea = 0;

        while (lp < rp) {
            int currentArea = Math.min(height.get(lp), height.get(rp)) * (rp - lp);

            maxArea = Math.max(maxArea, currentArea);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        System.out.println("Max water stored: " + maxArea);
    }
}
