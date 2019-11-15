package test1;

public class MathExample {

	public static void main(String[] args) {
		
		// Addition of 2 numbers
		/*int a=1;
		int b=10;
		int c=a+b;
        System.out.println("c is " +c); */
					 
		// Non-static method --> create class instance and reference the method 
		//classname object=new classname(); ---> to create instance of class when calling a another method in main method
		//MathExample operation=new MathExample();
		//operation.function(4, 9);
		
		// Static method - just CALL the method ----> function (c,d) 
		//functionStatic(9, 9);
		
		//Non-static method with return
		//MathExample operation=new MathExample();
		//System.out.println(operation.addition(2, 2));	
		
		//Static with return
		//System.out.println(staticaddition(2,2));
	}

	 //Non-static method
	public void function(int c, int d) {
	System.out.println("C value is " +c);
	System.out.println("D value is " +d);
	System.out.println("Sum is " + (c+d));
	System.out.println("Sub is " + (c-d));
	System.out.println("Mul is " + (c*d));
	System.out.println("Div is " + (c/d));
	
	}
	
	// static method 
	public static void functionStatic(int c, int d){
	System.out.println("C value is " +c);
	System.out.println("D value is " +d);
	System.out.println("Sum is " + (c+d));
	System.out.println("Sub is " + (c-d));
	System.out.println("Mul is " + (c*d));
	System.out.println("Div is " + (c/d));
	}
	
	//Non-static method with return
	public int addition(int c ,int d) {
		int a;
		a=c+d;
		return a;
	}
	
	//Static with return
	public static int staticaddition(int c, int d){
		int a;
		a=c+d;
		return a;		
	}
	
	}

