public class InsertElementInArray {
    public static void main(String[] args) {
        int[] arr={5,4,7,8,2,5,2};
        int oldIndex=arr.length-1;
        int[] newArr=new int[arr.length+1];
        int pos=3;
        int element=100;
        for(int i=newArr.length-1;i>=0;i--){
            if(i==pos-1){
                newArr[i]=element;

            }else{
                newArr[i]=arr[oldIndex];
                oldIndex--;
            }
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }

}
