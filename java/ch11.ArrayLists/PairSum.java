import java.util.ArrayList;
    //on sorted array
public class PairSum {

    //brute force
    public static boolean PairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //2 pointer
    public static boolean PairSum2(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
    int target = 5;

    boolean result1 = PairSum1(list, target);
    System.out.println("Pair with sum " + target + ": " + result1);

    boolean result2 = PairSum2(list, target);
    System.out.println("Pair with sum " + target + ": " + result2);
    }
}


