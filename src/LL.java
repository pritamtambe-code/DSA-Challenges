public class LL {

    // Head of the linked list
    Node head; // <-- You need this!

    // Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null; // initially next is null
        }
    }

    // Add node at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // link new node to current head
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next !=null){
            currentNode= currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void printlist(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data +"->");
            currentNode= currentNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("1");
        list.addFirst("2");
        list.addLast("3");
        list.printlist();
    }


}
