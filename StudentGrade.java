package CoreJava_Program;

import java.util.Scanner;

public class StudentGrade {
	double m1,m2,m3,m4,m5;
	public void totalMarks() {
		double total=m1+m2+m3+m4+m5;
		System.out.println("Total Marks= 500");
		System.out.println("Marks Obtained= "+total);
	}
	public void averageOfMarks() {
		double average=(m1+m2+m3+m4+m5)/5;
		System.out.println("Average of all subject is : "+average);
	}
	public void percentageOfMarks() {
		double percentage=(m1+m2+m3+m4+m5)/500*100;
		System.out.println("Percentage of Marks is : "+percentage);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentGrade ob=new StudentGrade();
		System.out.println("Enter marks of subject m1: ");
		ob.m1=sc.nextDouble();
		System.out.println("Enter marks of subject m2: ");
		ob.m2=sc.nextDouble();
		System.out.println("Enter marks of subject m3: ");
		ob.m3=sc.nextDouble();
		System.out.println("Enter marks of subject m4: ");
		ob.m4=sc.nextDouble();
		System.out.println("Enter marks of subject m5: ");
		ob.m5=sc.nextDouble();
		ob.totalMarks();
		ob.averageOfMarks();
		ob.percentageOfMarks();
	}
	
	

}
