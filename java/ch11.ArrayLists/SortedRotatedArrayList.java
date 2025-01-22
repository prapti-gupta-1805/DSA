import java.util.*;

public class SortedRotatedArrayList {

    // Two pointer
    public static boolean PairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;
                                                                                                                                                                                                                                           for (int i = 0; i < n-1; i++) {
           if(list.get(i) > list.get(i+1)) {
            pivot = i;
            break;
           }
            
        }
        
        int left = (pivot + 1);
        int right = pivot;

        while (left != right) {
            //case 1
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            }
            //case 2
            if (sum < target) {
                left = (left + 1) % n;
            //case 3
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
