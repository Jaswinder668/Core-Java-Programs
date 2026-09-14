import java.util.LinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int size=list.size()+1;
        int middle=size/2;
        System.out.print("Middle of Linked lsit is: "+list.get(middle));
    }
}
