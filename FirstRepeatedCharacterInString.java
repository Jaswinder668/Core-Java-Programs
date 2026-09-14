package Set_Programs;

import java.util.LinkedHashSet;

public class FirstRepeatedCharacterInString {
    public static void main(String[] args) {
        String str="programming";
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
            if(set.contains(ch)){
                System.out.println("First Repeated Character is : "+ch);
                break;
            }
            set.add(ch);
        }
    }
}
