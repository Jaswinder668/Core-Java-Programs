package CoreJava_Program;

public class ArmStrongNumber {
	
	public static void armstrongNumber(int num) {
		int originalNumber=num,armstrongNumber=0;
		if(num<=0) {
			System.out.println("Invalid Input");
			return;
		}
		while(num>0) {
			int digit=num%10;
			armstrongNumber=armstrongNumber+(digit*digit*digit);
			num/=10;
		}
		if(originalNumber==armstrongNumber)
			System.out.println(originalNumber+" is ArmStrongNumber");
		else
			System.out.println(originalNumber+" is Not ArmStrongNumber");	
	}
	
	public static void main(String[] args) {
		ArmStrongNumber.armstrongNumber(371);
	}

}
