package javaBasicsConditionalStatement;

public class IfElseCondition {

	public static void main(String[] args) {

		printGrade(20);
		

	}
	
	public static void printGrade(int marks) {
		
		if(marks>=90 && marks<=100) {
			System.out.println("Grade:A");
		}
		else if(marks>=60 && marks<=89) {
			System.out.println("Grade:B");
		}
		else if(marks>=40 && marks<=59) {
			System.out.println("Grade:C");
		}
		else {
			System.out.println("Grade:D Fail");
		}
			
		
	}

}
