public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int element=20;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==element){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;

            }

        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
