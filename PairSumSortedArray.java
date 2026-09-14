import java.util.Collection;
import java.util.Collections;

public class PairSumSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=5;
       int left=0,right=arr.length-1;
       while(left<right){
           int sum= arr[left]+arr[right];
           if(sum==target){
               System.out.println("arr["+left+"]+arr["+right+"]="+target);
               break;
           } else if (sum>target) {
               right--;

           }else{
               left++;
           }
       }

    }
}
