package Set_Programs;
import java.lang.*;
import java.util.TreeSet;

public class BasicTreesetOperation {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(12);
        set.add(8);
        set.add(7);
        System.out.println(set);

        int[] arr={4,5,7,8,2,1,10};
        TreeSet<Integer> arrSet=new TreeSet<>();
        for(int num:arr){
            arrSet.add(num);
        }
        System.out.println("Array list: "+arrSet);
        System.out.println("Smallest ELement in array is : "+arrSet.getFirst());
        System.out.println("Largest Element in array is : "+arrSet.getLast());





    }
}
