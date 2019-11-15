package javaBasicsMethodObjectStaticNonStaticRetrunVoid;

public class Math {

	
	// non static method- need to create an instance of the class and need to reference it to the object
	
	//static method- no need to create an instance- can directly call the method with its name 
	
	// non static return method- same as the non static method , void keyword wont be there and the method will return a value with return statement at the end
	
	// static return method - no need to create an instance , will return a value and contains return statement at the end
	
	public static void main(String[] args) {
		
	
		Math m=new Math();
		//m.operations(5,6);
		//m.operations(10, 10);
		

		
		m.operations(m.addition(1, 2), 10);
		
		m.operations(subtraction(5,4), 10);
		
		
	
		//operationsStatic(5,6);
	}
	
	//this is a non static method
	public void operations(int a, int b) {
		

		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("\n");
	}
	
	//this is a static method
	public static void operationsStatic(int a, int b) {
		

		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("\n");
	}
	
	//this is a non static return method
	public int addition(int a, int b) {
		int c;
		c=a+b;	
		return c;
	}
	
	
	//this is a non static return method
	public static int subtraction(int a, int b) {
		int c;
		c=a-b;	
		return c;
	}

	


}
