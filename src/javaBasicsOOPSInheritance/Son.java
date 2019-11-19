package javaBasicsOOPSInheritance;

public class Son extends Father {
	
	int num=600;
	 String name="Kiran";

	public static void main(String[] args) {
		
		Son s= new Son();
		s.method5();
		s.method6();
		s.method1();
		method2();
		System.out.println(s.method3());
		System.out.println(method4());
		
		System.out.println(s.num);
		System.out.println(s.name);
		
	}
	
	
	public void method5() {
	System.out.println("This method5");	
	}
	
	public void method6() {
	System.out.println("This method6");	
	}
	

}


//by using extends keyword and the parent class name- we are able to inherit the properties from father class and we don't have to creat the instance of the class here'