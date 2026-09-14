import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println("Before : "+li);
        int start=0;
        int end=li.size()-1;

        while(start<end) {
            int temp = li.get(start);
            li.set(start, li.get(end));
            li.set(end, temp);
            start++;
            end--;
        }
        System.out.print("After: "+li);

    }
}
