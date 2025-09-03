package Linked_List;

public class Delete_First {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


    public void printlist() {
        if (head == null) {
            System.out.print("LIST IS NULL");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }


    public void deletefirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }
        Node currentNode = head;
        head = currentNode.next;
    }



    public static void main(String[] args) {
        Delete_First list = new Delete_First();
        list.addLast("1");
        list.addLast("2");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.deletefirst();

        list.printlist();

    }
}
