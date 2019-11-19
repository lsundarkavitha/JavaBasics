package javaBasicsOOPSInheritance;

public class Father {
	
	int num=100;
	String name="Kumar";

	public static void main(String[] args) {

		Father f= new Father();
		f.method1();
		method2();
		System.out.println(f.method3());
		System.out.println(method4());
		
		System.out.println(f.num);
		System.out.println(f.name);

	}
	
	public void method1() {
	System.out.println("This method1");	
	}

	
	public static void method2() {
		System.out.println( "This is method2");
	}
	
	public int method3() {
		return 5;
	}
	
	public static String method4() {
		return "This is method 4: Munny";
	}
}


// since the variables are declared on the global class level- to call it it has to be declared as static int num.

/**
 * Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. ... The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
 *  When you inherit from an existing class, you can reuse methods and fields of the parent class.
 */
