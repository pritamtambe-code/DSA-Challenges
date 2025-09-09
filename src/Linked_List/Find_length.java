package Linked_List;


public class Find_length {
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
    public void getLength(){
        int length0flist = 0;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode !=null){
            currentNode = currentNode.next;
            length0flist  ++;
        }
        System.out.println(length0flist);


    }

    public static void main(String[] args) {
        Find_length list = new Find_length();
        list.addfirst("1");
        list.addfirst("2");
        list.addfirst("3");
        list.printlist();
        list.getLength();




    }
}


