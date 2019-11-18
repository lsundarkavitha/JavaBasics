package test3;

public class Calculation {

	public static void main(String[] args) {
		Calculation m1=new Calculation();
		m1.CalculationNonStatic(12, 3);
		CalculationStatic(10,2);
		System.out.println("****************************************");
		System.out.println("Sum in Static is:"+ additionreturnwithStatic(5,5));
		System.out.println("****************************************");
		System.out.println("Sum in Non-static is:" + m1.additionreturnwithNonStatic(3,3));
	}
	//static
		public static void CalculationStatic(int a, int b) {
			
			System.out.println("Addition is:"+ (a+b));
			System.out.println("Subtraction is:"+ (a-b));
			System.out.println("Multiplication is:"+ (a*b));
			System.out.println("Division is:"+ (a/b));
			
		}
	
		//Non-static
		public  void CalculationNonStatic(int a, int b) {
			
			System.out.println("Addition is:"+ (a+b));
			System.out.println("Subtraction is:"+ (a-b));
			System.out.println("Multiplication is:"+ (a*b));
			System.out.println("Division is:"+ (a/b));
			System.out.println("************************************");
		}
		
		//return with static method
		public static int additionreturnwithStatic(int a, int b) {
		int c=a+b;
	    return c;
		}
		
		//return with non-static method
		public int additionreturnwithNonStatic(int a, int b) {
			int c=a+b;
			return c;
			
		}
		
}
