import java.util.*;

public class SortedRotatedArrayList {

    // Two pointer
    public static boolean PairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;
        int Left = 0, Right = list.size() - 1;
        while (Left <= Right) {
            int mid = Left + (Right - Left) / 2;

            if (mid < Right && list.get(mid) > list.get(mid + 1)) {
                pivot = mid;
            }
            if (mid > Left && list.get(mid) < list.get(mid - 1)) {
                 pivot = mid - 1;
            }
            if (list.get(Left) <= list.get(mid)) {
                Left = mid + 1;
            } else {
                Right = mid - 1;
            }
        }
        
        int left = (pivot + 1) % n;
        int right = pivot;

        while (left != right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11); list.add(15); list.add(6); list.add(8); list.add(9); list.add(10);
        int target = 16;
        
        boolean result = PairSum2(list, target);
        System.out.println("Pair with sum " + target + " (Two pointer): " + result);
    }
}
