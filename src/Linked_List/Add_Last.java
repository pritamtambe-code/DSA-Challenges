// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class L1 {
    Node head;

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

    public static void main(String[] args) {
        L1 list = new L1();
        list.addLast("1");
        list.addLast("2");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.printlist();

    }

}

    
    

