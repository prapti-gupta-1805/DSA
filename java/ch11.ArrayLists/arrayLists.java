import java.util.*;
public class arrayLists {
    //dynamic size
    //primitive data type
    //can't be stored directly
    public static void main(String args[]) {
            //create
            ArrayList<Integer> list = new ArrayList<>();

            //input
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println(list);

            list.add(1,9);

            //traverse
            int ele = list.get(3); //pass index
            System.out.println(ele);

            //remove element
            list.remove(2); //pass index
            System.out.println(list);

            //set element at index
            list.set(2, 10); //(index,value)
            System.out.println(list);

            //contains element
            System.out.println(list.contains(1));
            System.out.println(list.contains(11));
        }
    }
