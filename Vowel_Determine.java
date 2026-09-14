import java.util.Scanner;
class Vowel_Determine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Alphabets :");
       String a=sc.next();
       
       if(a.length()==1){
        char c=a.charAt(0);
        char ch=Character.toLowerCase(c);
        if(Character.isLetter(ch)){
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                System.out.print("This Character is Vowel");
            }
            else{
                System.out.print("This Character is Constant");
            }

        }else{
            System.out.print("Special Symbol");
        }
       }

    }
}