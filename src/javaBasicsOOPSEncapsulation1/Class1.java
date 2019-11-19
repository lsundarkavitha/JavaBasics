package javaBasicsOOPSEncapsulation1;

public class Class1 {


	String text1="this is default text";
	public String text2="this is public  text";
	protected String text3="this is protected text";
	private String text4="this is private text";
	
	static String text5="this is static default text";
	public static String text6="this is static public  text";
	protected static String text7="this is static protected text";
	private static String text8="this is static private text";
	
	
	//methods
	void method1() {
		System.out.println("This is a default method");
	}
	
	public void method2() {
		System.out.println("This is a public method");
	}
	
	protected void method3() {
		System.out.println("This is a protected method");
	}
	
	private void method4() {
		System.out.println("This is a private method");
	}
	
	
	
	static void method5() {
		System.out.println("This is a  static default method");
	}
	
	public static void method6() {
		System.out.println("This is a static public method");
	}
	
	protected static void method7() {
		System.out.println("This is a static protected method");
	}
	
	private static void method8() {
		System.out.println("This is a  static private method");
	}
	
	
	
	public static void main(String[] args) {
		
		Class1 c1= new Class1();
		
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		method5();
		method6();
		method7();
		method8();
		
		System.out.println(c1.text1);
		System.out.println(c1.text2);
		System.out.println(c1.text3);
		System.out.println(c1.text4);
		
		
		
		System.out.println(text5);
		System.out.println(text6);
		System.out.println(text7);
		System.out.println(text8);
		


	}

}


//encapsulation is nothing but protecting the data
/*
public 
protected
private
default
All the above are called access modifiers.

you can access all the above access modifers methods and variables in the same class without any issues 


private methods can be accessed only within the same class
*/