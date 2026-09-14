package Set_Programs;

import java.util.LinkedHashSet;

public class FirstRepatedNumber {
    public static void main(String[] args) {
        int[] arr={10,20,20,304,40,40,50};
        LinkedHashSet<Integer> set=new LinkedHashSet<>();

        for(int num:arr){
            if(set.contains(num)){
                System.out.print("First Repeated Number is :"+num);
                break;
            }
            set.add(num);
        }
    }
}
