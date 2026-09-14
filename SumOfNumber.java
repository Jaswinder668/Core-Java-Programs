package CoreJava_Program;

public class SumOfNumber {
	
	public static int sumOfNumber(int num) {
		int sum=0;
		if(num<0) {
			num=-num;
		}
		while(num!=0) {
			sum=sum+(num%10);
			num/=10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int result=SumOfNumber.sumOfNumber(-459);
		System.out.println("Sum is :"+result);
		
		
	}

}
