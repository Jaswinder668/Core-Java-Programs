package CoreJava_Program;

public class ReverseNumber {
	
public void reverseNumber(int num) {
	if(num<=0) {
		System.out.println("Invalid Input");
		return;
	}
	int rev=0;
	System.out.println("Number is : "+num);
	while(num>0) {
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	}
	System.out.println("Reverse of this number is : "+rev);	
}
public static void main(String[] args) {
	ReverseNumber ob=new ReverseNumber();
	ob.reverseNumber(345);
}
}
