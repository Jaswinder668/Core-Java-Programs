package CoreJava_Program;

public class LargestNumber {
	public void largestNumber(double a,double b,double c) {
		if(a>=b&&a>=c) {
			System.out.print(a+" is largest");
		}else if(b>=a&&b>=c) {
			System.out.print(b+" is largest");
			
		}else if(c>=a&&c>=b) {
			System.out.print(c+" is largest");
			
		}
	}
	public static void main(String[] args) {
		LargestNumber ob=new LargestNumber();
		ob.largestNumber(10, 20, 40);
	}

}
