package CoreJava_Program;

import java.util.Scanner;

public class LeapYear {
	
	public static boolean leapYear(int year) {
		boolean isleap=false;
		if(year%400==0||year%4==0&&year%100!=0) {
			isleap=true;
			return isleap;
			
		}
		return isleap;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int Year=sc.nextInt();
		boolean isleap=LeapYear.leapYear(Year);
		if(isleap)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		
	

}
}
