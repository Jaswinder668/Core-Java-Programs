class LL{
    Node head;
    int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;

        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;


    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode!=null){
            lastNode=lastNode.next;

        }
        lastNode=newNode;
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;

        }

    }

    public static void main(String[] args) {
        LL list=new LL();
        System.out.println("Head value: "+list.head);
        list.addFirst("12");
        System.out.println("Head value: "+list.head);
        list.addFirst("13");
        System.out.println("Head value: "+list.head);
        list.addFirst("14");
        System.out.println("Head value: "+list.head);
        list.addFirst("15");
        System.out.println("Head value: "+list.head);
        System.out.println( list.size);


        list.printList();




    }
}