package Linked_List;


class LL {
    Node head;

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
        LL list = new LL();
        list.addfirst("1");
        list.addfirst("2");
        list.addfirst("3");
        list.printlist();


    }
}
