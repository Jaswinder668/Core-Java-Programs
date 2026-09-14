package Set_Programs;

import java.util.LinkedHashSet;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] arr1={10,20,30,4050,60,37};
        int[] arr2={20,30,40,50,60,60};
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        LinkedHashSet<Integer> commonElements=new LinkedHashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                commonElements.add(num);
            }
        }
        System.out.println("Common Elements in both array is: "+commonElements);
    }
}
