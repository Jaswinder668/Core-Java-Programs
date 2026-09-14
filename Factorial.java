package CoreJava_Program;

public class Factorial {
	public static int findFactorial(int num) {
		if(num<0) {
			System.out.println("Invalid Input");
			return -1;
		}
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	public static void main(String[] args) {
		int num=-1;
		int result=Factorial.findFactorial(num);
		if(result>0) {
		System.out.println("Factorial of "+num+" is :"+result);
		}
		
	}

}
