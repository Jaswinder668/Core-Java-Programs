import java.util.LinkedList;

public class Palindrome_List {
    public static void main(String[] args) {

        LinkedList<Integer> li=new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(30);
        li.add(56);
        li.add(20);
        li.add(10);
        int start=0;
        boolean isPlaindrome=false;
        int end=li.size()-1;
        while(start<end){
            if(li.get(start)==li.get(end)){
                start++;
                end--;
                isPlaindrome=true;
            }else if(li.get(start)!=li.get(end)){
                isPlaindrome=false;
                break;
            }
        }
        if(isPlaindrome){
            System.out.print("Palindrome Linked List");
        }else{
            System.out.print("Not Plaindrome Linked List");
        }

    }
}
