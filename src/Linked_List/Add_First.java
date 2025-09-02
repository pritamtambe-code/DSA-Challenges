package Linked_List;


public class Add_First {
    Node head;
    int size;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next= null;
        }
    }

    public void addfirst( String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void printlist(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data +"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Add_First list = new Add_First();
        list.addfirst("1");
        list.addfirst("2");
        list.addfirst("3");
        list.printlist();
        System.out.println(list.size);


    }
}
