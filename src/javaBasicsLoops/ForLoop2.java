package javaBasicsLoops;

public class ForLoop2 {

	public static void main(String[] args) {
		
		printNumbers(10);
		//printNumbersReverse(10);
	}

	public static void printNumber(int num) {
		System.out.println(num);
	}

	public static void printNumbers(int num) {
		
		for(int i=1;i<=num;i++) {
			
			System.out.println("Numbers:"+i);
		}
	
	}
	

	public static void printNumbersReverse(int num) {
		
		for(int i=num;i>=1;i--) {
			
			System.out.println("Numbers:"+i);
		}
	
	}
	
	
	

}



// for loop syntax
/*
for (initialization condition; testing condition; increment/decrement)
	{
		statement(s)
	}
*/
// i++ is nothing i=i+1; increement operator
//i-- is i=i-1 - decreement operatopr
//debugging - step into and step over - step into debugs indepth and step over moves to next line
