public class MaxiimumSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,7,7};
        int size=2;
        int maxSum=0;
        for(int i=0;i<=arr.length-size;i++){
            for(int j=0;j<=i;j++){
                int sum=arr[j]+arr[j+1];
                if(sum>maxSum){

                    maxSum=sum;
                }
            }

        }
        System.out.println(maxSum);
    }
}
