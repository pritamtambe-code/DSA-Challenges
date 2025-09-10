package High_level;

// Online Java Compiler


public class Reverse_Linkedlist {
    Node head;
    int size;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printlist(){

        if(head == null){
            System.out.print("LIST IS NULL");
            return;
        }
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void rev(){
        Node currentNode = head;
        Node previousNode = null;
        Node next;

        while(currentNode!= null){
            next = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
        }
        head = previousNode;
    }




    public static void main(String[] args) {
        Reverse_Linkedlist list = new Reverse_Linkedlist();
        list.addLast("1");
        list.addLast("2");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.printlist();
        list.rev();
        list.printlist();

    }
}




