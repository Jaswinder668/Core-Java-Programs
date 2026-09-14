package LinkedList_Programs;


 public class Linkedlist{
    ListNode head;
  static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val; }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}

    public static Linkedlist.ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val){
            head=head.next;
        }
        ListNode curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
    public void add(int data){
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }




     //Main method for execute class
     public static void main(String[] args){
         Linkedlist li=new Linkedlist();
         li.add(10);
         li.add(20);
         li.add(20);
         li.add(40);
         ListNode head= removeElements(li.head,20);
         while(head!=null){
             System.out.print(head.val+"->");
             head=head.next;
         }
     }
}



