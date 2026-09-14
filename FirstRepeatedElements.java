import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,4,5,5,6,7};
        Set<Integer> set=new HashSet<>();
        int ans=-1;
        for(int num:arr){
            if(set.contains(num)){
                ans=num;
                break;
            }
            set.add(num);
        }
        System.out.print("First Repeated Number: "+ans);

    }
}
