import java.util.LinkedList;

public class LinkedLargest_SecondLargest {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.add(10);
        li.add(7);
        li.add(5);
        li.add(3);
        li.add(2);
        li.add(9);

         int largest=Integer.MIN_VALUE;
         int secondLargest=Integer.MIN_VALUE;
         for(int i=0;i<li.size();i++){
             if(largest<li.get(i)){
                 secondLargest=largest;
                 largest=li.get(i);
             }else if(secondLargest<li.get(i)&&li.get(i)!=largest){
                 secondLargest=li.get(i);
             }
         }
         System.out.println("largest :"+largest);
         System.out.println("SecondLargest: "+secondLargest);
    }
}
