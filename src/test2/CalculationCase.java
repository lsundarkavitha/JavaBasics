package test2;

public class CalculationCase {

	public static void main(String[] args) {
		
		CalculationCase Maths=new CalculationCase();
		//Maths.CalculationCaseNonStatic(2, 2);
		
		//CalculationCaseStatic(2,2);
		
		System.out.println(returnadditionStatic(2,3));
	}
		
	//static 
	public static void CalculationCaseStatic(int a, int b) {
		System.out.println("Value of a is " +a);
		System.out.println("Value of b is "+b);
		System.out.println("Addition is:"+ (a+b));
		System.out.println("Subtraction is:"+ (a-b));
		System.out.println("Multiplication is:"+ (a*b));
		System.out.println("Division is:"+ (a/b));
		
	}
	public void CalculationCaseNonStatic(int a, int b) {
		System.out.println("Value of a is " +a);
		System.out.println("Value of b is "+b);
		System.out.println("Addition is:"+ (a+b));
		System.out.println("Subtraction is:"+ (a-b));
		System.out.println("Multiplication is:"+ (a*b));
		System.out.println("Division is:"+ (a/b));
	}
	
	//Static with return
	public static int returnadditionStatic(int a, int b) {
		
		return a+b;
	}
	public int returnadditionNonStatic(int a, int b) {
		return a+b;
	}
	

}


