package CoreJava_Program;

import java.util.Scanner;

public class Swap {
	public void swap_Numbers(int a,int b) {
		System.out.println("Number before Swapping \na="+a+"\nb="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("Number After Swapping \na="+a+"\nb="+b);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Swap ob=new Swap();
		System.out.print("Enter Number a :");
		int a=sc.nextInt();
		System.out.print("Enter Number b :");
		int b=sc.nextInt();
		ob.swap_Numbers(a, b);
		sc.close();
		
	}

}
