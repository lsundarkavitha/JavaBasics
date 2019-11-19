package javaBasicsOOPSEncapsulation2;

import javaBasicsOOPSEncapsulation1.Class1;

public class Class6 extends Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Class6 c6= new Class6();
		c6.method2();
		c6.method3();
		method6();
		method7();
		
		System.out.println(c6.text2);
		System.out.println(c6.text3);
		System.out.println(text6);
		System.out.println(text7);

	}

}


// once we inheris using inheritance concpets- we can access public and protected methods and variables



/*

public method- can be accessed in any class and any package
private method- only within the same class you can access
protected method- can be accessed in any class within the same package and can be accessed in different package(class) using extends keyword( inheritance)
default method - can be accessed in any class within the same package but cannot be accessed anywhere outside the package


*/