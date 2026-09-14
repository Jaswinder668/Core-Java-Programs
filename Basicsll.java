import java.sql.SQLOutput;

public class Basicsll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static void print(Node head){
        while(head.next!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8 );
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.next.next.next.data);
        Node g=new Node(10);
        g.next=b;
        a.next=g;

        print(a);






    }
}
