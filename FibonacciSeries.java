package CoreJava_Program;

public class FibonacciSeries {
	public static void fibonacciSeries(int num) {
		if(num<=0) {
			System.out.println("Invalid Input");
			return;
		}
		int num1=0,num2=1;
		System.out.print("Fibonacci: ");
		
		for(int i=1;i<=num;i++) {
			//print the number
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		
	}
	public static void main(String[] args) {
		FibonacciSeries.fibonacciSeries(10);
		
	}

}
