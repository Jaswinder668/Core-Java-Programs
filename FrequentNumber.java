import java.util.ArrayList;

public class FrequentNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        int number=0;
        nums.add(10);
        nums.add(20);
        nums.add(7);
        nums.add(20);
        nums.add(20);
        nums.add(7);
        nums.add(7);
        nums.add(7);

        int maxCount=0;

        for(int i=0;i<nums.size();i++){
            int count=0;
            for(int j=0;j<nums.size();j++){
                if(nums.get(i).equals(nums.get(j))){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount=count;
                number=nums.get(i);
            }
        }
        System.out.println(number+" is arrive "+maxCount+" times");
       
    }
    
}
 