package javaBasicsOOPSEncapsulation2;

import javaBasicsOOPSEncapsulation1.Class1;

public class Class5 {

	public static void main(String[] args) {

		
		//create the instance of the class1
		
		Class1 c1= new Class1();
		c1.method2();
		Class1.method6();

		System.out.println(c1.text2);
		System.out.println(Class1.text6);
	}

}


//here when we create an instance of the class1 - only public methods are available