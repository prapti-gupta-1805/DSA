public class LinkedList {
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

//add to linked list
    //add first

    public void addFirst(int data) {
        
        //step 1
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step 2
        newNode.next = head;

        //step 3
        head = newNode;
    }
    public static void main(String[] args) {      
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.addFirst(1);
    }
}