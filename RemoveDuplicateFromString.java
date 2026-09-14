package Set_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str="hello";
        LinkedHashSet<Character> charSet=new LinkedHashSet<>();

        for(char ch:str.toCharArray()){
            charSet.add(ch);
        }
        String newStr="";
        for(char ch:charSet){
            newStr=newStr+ch;
        }
        System.out.println("String Before: "+str);
        System.out.println("String after Duplicates Remove: "+newStr);
    }
}
