import java.util.LinkedList;

public class LinkedList_All_Methods {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        LinkedList<Integer>  copy=new LinkedList<>();

        System.out.println(list.size()); // 5
        System.out.println(list.getFirst()); //10
        System.out.println(list.getLast());  //50
        System.out.println(list.remove()); //first element remove 10 return also remove elemnt
        System.out.println(list); // [20,30,40,50]
        System.out.println(list.contains(30)); //true
        System.out.println(list.peek()); //20
        System.out.println(list.poll()); // remove and retrun remove elemnt
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);

    }
}
