package javaBasicsKeyword;

public class Class1 {
	
	 int a=5;
	 String text="Kiran";
	
	

	public static void main(String[] args) {
		

		Class1 m= new Class1();
		//m.method1();
		
		m.method2();
		
	
	}
	
	
	public void method1() {
		
		int a=10;
		String text="Kumar";
		
		System.out.println(a);
		System.out.println(text);

	}

	//this keyword enables us to reference to global variable
	public  void method2() {
		
		int a=20;
		String text="Munny";
		
		
		System.out.println(this.a);
		System.out.println(this.text);
	}
}
