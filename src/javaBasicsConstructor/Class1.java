package javaBasicsConstructor;

public class Class1 {

	public static void main(String[] args) {
		
		Class1 m= new Class1();
		Class1 m1= new Class1(10,"kiran");
		Class1 m2= new Class1(80);
		Class1 m3= new Class1(true);
		

	}
	
	//Constructor is a method which will have the same name as the class name
	//it will get invoked as soon as instance of the class is created 
	//purpose of this is that the constructor will get called by default before all other methods execution
	//normal constructor
	public Class1() {
		
		System.out.println("This a constructor");
	}
	
	//parameterized constructor2
	
	public Class1(int a , String text) {
		System.out.println("Print a:"+a);
		System.out.println("Print text:"+text);
		
	}
	
	
	//parameterized constructor3
	
	public Class1(int a ) {
		System.out.println("Print the a:"+a);
	}
	
	
	//parameterized constructor3
	
	public Class1(boolean flag) {
		System.out.println("Print boolean value:"+flag);
	}
	
	
	
	
	
	
	
	
	/*
	
	public void method1() {
		System.out.println("this is method 1 non static");
	}
	
	public static void method2() {
		System.out.println("this is method 2 static");
	}
	*/

}
