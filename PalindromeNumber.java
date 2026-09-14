package CoreJava_Program;

public class PalindromeNumber {
	
	public static void palindromeCheck(int num) {
		if(num<0) {
			System.out.println("Invalid Input not enter negative number");
			return;
		}
		int originalNum=num,rev=0;
		while(num>0) {
			rev=rev*10+(num%10);
			num/=10;	
		}
		if(originalNum==rev)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}
	public static void main(String[] args) {
		PalindromeNumber.palindromeCheck(121);
		
		
	}

}
