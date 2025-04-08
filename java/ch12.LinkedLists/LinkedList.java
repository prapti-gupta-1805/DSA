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

    //methods
    public void addFirst(int data) {
        //create new node
        Node newNode = new Node(data);

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

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);

        ll.addFirst(1);
    }
}