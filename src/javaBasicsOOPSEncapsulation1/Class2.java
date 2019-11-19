package javaBasicsOOPSEncapsulation1;

public class Class2 {
	
	public static void main (String args[]) {
		
		// creating the instance of class 1
		Class1 c1= new Class1();
		c1.method1();
		c1.method2();
		c1.method3();
		Class1.method5();
		Class1.method6();
		Class1.method7();
		
		System.out.println(c1.text1);
		System.out.println(c1.text2);
		System.out.println(c1.text3);

		System.out.println(Class1.text5);
		System.out.println(Class1.text6);
		System.out.println(Class1.text7);

	}
	

}

// here u can access all methods from class 1 except private ( This is when you create an instance of the class( class1)


