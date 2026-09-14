package CoreJava_Program;

import java.util.Scanner;

public class EvenOrOdd {
	public void even_Odd(int num) {
		if(num==0||num==1) {
			System.out.println("Invalid Number Entered");
			return;
			
		}
		if(num%2==0&&num>0) {
			System.out.println("Positive Even Number");
		}else if(num%2==0&&num<0) {
			System.out.println("Negative Even Number");
		}else if(num%2!=0&&num>0) {
			System.out.println("Positive Odd Number");
		}else if(num%2!=0&&num<0) {
			System.out.println("Negative Odd Number");
		}
		
	}
	public static void main(String[] args) {
		EvenOrOdd ob=new EvenOrOdd();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		ob.even_Odd(num);
		sc.close();
		
	}

}
