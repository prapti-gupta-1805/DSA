public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { //O(1)
        //step 1 : create new Node
        Node newNode = new Node(data);
        size++;

        //check if LL is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 - newMode next = head
        newNode.next = head;

        //step 3 - head = newNode
        head = newNode;

    }

    public void addLast(int data) { //O(1)
        //step 1 : create new Node
        Node newNode = new Node(data);
        size++;

        //check if LL is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 - tail next = newNode
        tail.next = newNode;

        //step 3 - tail = newNode
        tail = newNode;
    }

    //add anywhere
    public void add(int index, int data) {
    Node newNode = new Node(data);
    size++;

    if (head == null) {
        addFirst(data);
        return;
    }

    Node temp = head;
    int i = 0;

    while (i < index - 1 && temp != null) {
        temp = temp.next;
        i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    if (newNode.next == null) {
        tail = newNode;
    }
}


    //print an LL
    public void printList(){
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    } 

    public static void main(String[] args) {
    //for a single node LL head and tail are the same
        LinkedList ll = new LinkedList();
        //ll.head = ll.new Node(1);
        //ll.head.next = ll.new Node(2);

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        ll.add(2,3);

        ll.printList();
        System.out.println(ll.size);
    }
}