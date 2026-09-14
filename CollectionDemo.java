import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class CollectionDemo {
    public static void main(String[] args) {

        System.out.println("----------ArrayList-------------");
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(20);
        a.add(30);
        a.add(30);
        a.add(40);
        System.out.println(a);
        System.out.println("-------------LinkedList-------------");
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(20);
        l.add(30);
        l.add(30);
        l.add(40);
        System.out.println(l);
        System.out.println("-------------Hashset--------------");
        HashSet<Integer> s=new HashSet<Integer>();  // Not maintain Insertion Order yo
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);

        TreeSet<Integer> t=new TreeSet<>();
        System.out.println("-------------TreeSet----------------");
        t.add(20);
        t.add(10);
        t.add(10);
        t.add(30);
        t.add(50);
        t.add(40);
        System.out.println(t);





    }
}
