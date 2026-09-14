import java.util.ArrayList;

class EverSecond{
    public static void remove(ArrayList<Integer> num){
        for(int i=0;i<num.size();i++){
            if(i%2==1){
                num.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println("Before: "+nums);
        remove(nums);
        System.out.println("After: "+nums);

        
    }
}