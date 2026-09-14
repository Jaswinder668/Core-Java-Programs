package LinkedList_Programs;


class ReverseList {

    static class Node {
        int data;
        Node next;
    // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     //Method to Reverse the list
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        System.out.println("Original:");
        printList(n1);

        n1 = reverse(n1);

        System.out.println("\nReverse:");
        printList(n1);
    }
}

