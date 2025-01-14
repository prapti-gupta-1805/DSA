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

        //size
        System.out.println(list.size());

        //print arraylist in reverse
        for(int i = list.size()-1; i>=0; i-- ) {
            System.out.println(list.get(i));
        }

        //sorting
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder()); //comparator
        System.out.println(list);

        //2D ArrayLists
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        mainlist.add(list2);

        //printing 2D ArrayList
        for(int i = 0; i <mainlist.size(); i++) {
            ArrayList<Integer> curr = mainlist.get(i);
            for(int j = 0; j <curr.size();j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }
    }
}
