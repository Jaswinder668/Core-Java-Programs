package Set_Programs;

import java.util.TreeSet;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr={50,30,20,40,10};
        TreeSet<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int k=3;
        if(k>set.size()){
            System.out.println("kth  smallest does not exist");
        }
        int count=0;
        for(int num:set){
            if(count==k-1){
                System.out.println("Smallest Element at kth position is : "+num);
                break;
            }
            count++;
        }

    }
}
