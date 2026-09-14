package CoreJava_Program;

import java.util.Scanner;

public class ArthmeticOperation {
	public void calculation(int a,int b) {
		System.out.println("Sum: "+(a+b));
		System.out.println("Subsituion: "+(a-b));
		System.out.println("Maltiplication: "+(a*b));
		System.out.println("Quotient: "+(a/b));
		System.out.println("Remainder: "+(a%b));
		
	}
	
	public static void main(String[] args) {
		ArthmeticOperation  ob=new ArthmeticOperation();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
		ob.calculation(a, b);
		sc.close();
		
		
	}

}
