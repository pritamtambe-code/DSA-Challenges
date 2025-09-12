package linked_list_leetcode;

public class linkedlist_Palindrome {
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

    public void middle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node next = null;
        while(slow!=null){
            next = slow.next;
            slow.next= prev;
            prev = slow;
            slow = next;
        }

        while(prev!=null){
            if(head.data!=prev.data){
                System.out.println("no");
            }
            head = head.next;
            prev = prev.next;

        }
        System.out.println("yes");

    }



    public static void main(String[] args) {
        linkedlist_Palindrome  list = new linkedlist_Palindrome ();
        list.addLast("1");
        list.addLast("2");
        list.addLast("2");
        list.addLast("1");
        // list.addLast("8");

        list.printlist();
        list.middle();


    }
}





