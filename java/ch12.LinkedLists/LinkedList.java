public class LinkedList{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //methods
    public void addFirst(int data) {
        //create new node
        Node newNode = new Node(data);
        size++;
        //if ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //make new node point to head
        newNode.next = head;
        //label new node as head
        head = newNode;
    }

    public void addLast(int data) {
        //create new node
        Node newNode = new Node(data);
        size++;
        //check if ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //make tail.next point to new node
        tail.next = newNode;
        //label new node as tail
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int count = 0;

        while (count < idx - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        
        if (temp == null) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        size++; 

        newNode.next = temp.next;

        temp.next = newNode;
    }

    public void removeFirst() {
        if(size == 0) {
            System.out.println("ll is empty");
            return;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            System.out.println(val);
            size--;
            return;
        }

        int val = head.data;
        head = head.next;
        System.out.println(val);
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return;
        }
    
        int val = tail.data;
    
        if (size == 1) {
            head = tail = null;
            System.out.println(val);
            size--;
            return;
        }
    
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
    
        temp.next = null;
        tail = temp;
        size--;
    
        System.out.println(val);
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

    while(temp != null) {
        if (temp.data == key) {
            return i;
        }
        temp = temp.next;
        i++;
    }

    return -1;

    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
    
        // Add elements
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
    
        // Print original list
        System.out.println("Original List:");
        ll.printList();
        System.out.println("Size: " + ll.size);

        System.out.println("Removed from beginning: ");
        ll.removeFirst();
    
        System.out.println("Removed from end: ");
        ll.removeLast();
    
        // Print updated list
        System.out.println("Updated List:");
        ll.printList();
        System.out.println("Size: " + ll.size);
    
        // Search for a value
        int searchKey = 4;
        int index = ll.itrSearch(searchKey);
        System.out.println("Index of " + searchKey + ": " + index);
    }
    
}