class LL {
    
    Node head;
    private int size; 

    // Constructor to initialize size to 0
    LL() {
        this.size = 0;
    }

    // Node class representing each element
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++; // Increase size whenever a new node is successfully created
        }
    }

    // --- ADD OPERATIONS ---

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    // --- PRINT OPERATION ---

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    // --- DELETE OPERATIONS ---

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--; // Decrease size when a node is deleted
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--; // Decrease size when a node is deleted
        
        // Corner Case: If there is only one node in the list
        if (head.next == null) { 
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }


    // --- SIZE OPERATION ---

    public int getSize() {
        return size;
    }


    // --- MAIN EXECUTOR ---

    public static void main(String args[]) {
        LL list = new LL();
        
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("list");
        list.printList();
        
        list.addFirst("this");
        list.printList();

        // Testing Deletions
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        // Testing Size
        System.out.println("Current Size: " + list.getSize());
        
        list.addFirst("this");
        System.out.println("Current Size: " + list.getSize());
    }
}