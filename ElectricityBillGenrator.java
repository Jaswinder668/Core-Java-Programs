package CoreJava_Program;

public class ElectricityBillGenrator {
	public static void billGenrate(double unit){
		if(unit<=0) {
			System.out.println("Zero Electricity bill : 0.00");
			return;
		}else if(unit<=100) {
			double bill=unit*5;
			System.out.println("Your Consumed Units: "+unit);
			System.out.println("Electricity Bill is : "+bill);
		}else if(unit<=200) {
			double bill=unit*7;
			System.out.println("Your Consumed Units: "+unit);
			System.out.println("Electricity Bill is : "+bill);
			
		}else {
			double bill=unit*10;
			System.out.println("Your Consumed Units: "+unit);
			System.out.println("Electricity Bill is : "+bill);
			
		}
		
	}
	
	
	
public static void main(String[] args) {
	ElectricityBillGenrator.billGenrate(5);
	
}

}
