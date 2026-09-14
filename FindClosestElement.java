package Set_Programs;

import java.util.TreeSet;

public class FindClosestElement {
    public static void main(String[] args) {
        int[] arr={5,10,15,20,25,30,35};
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        int x=7;
        Integer lower=set.floor(x);
        Integer higher=set.ceiling(x);
        if(lower==null){
            System.out.print("Closest Number: "+higher);
        }else if(higher==null){
            System.out.println("Closest Number: "+lower);
        }else{
            if(x-lower<higher-x){
                System.out.println("Closest Number near x: "+lower);
            }else{
                System.out.println("Closest Number near x: "+higher);
            }
        }
    }
}
