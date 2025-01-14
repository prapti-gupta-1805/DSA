import java.util.*;

public class arrayLists {
    public static void main(String[] args) {
        //creation
        ArrayList<Integer> list = new ArrayList<>();

        //input
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(3,10); //(index,element) pushes next elements forward
        System.out.println(list);

        //traverse
        System.out.println(list.get(2)); //pass index O(1)

        //remove
        list.remove(2); //pass index O(n)
        System.out.println(list);

        //set element at index
        list.set(2,10); //(index,element) O(n)
        System.out.println(list);

        //contains
        System.out.println(list.contains(2)); //boolean
        System.out.println(list.contains(11));
    }
}
