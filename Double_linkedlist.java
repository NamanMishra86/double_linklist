import java.util.*;
class Double_linkedlist {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int n, data;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data:");
            data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            }

            System.out.println("Do you want to add more data? If yes, press 1:");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Double_linkedlist list = new Double_linkedlist();
        list.creation();
        list.traverse();
    }
}

