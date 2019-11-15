package javaBasicsLoops;

public class ForLoop {

	public static void main(String[] args) {
		
		printNumbers(10);
		//printNumbersReverse(10);
	}

	public static void printNumber(int num) {
		System.out.println(num);
	}

	public static void printNumbers(int num) {
		
		for(int i=1;i<=num;++i) {
			
			System.out.println("Numbers:"+i);
		}
	
	}
	

	public static void printNumbersReverse(int num) {
		
		for(int i=num;i>=1;i--) {
			
			System.out.println("Numbers:"+i);
		}
	
	}
	
	
	

}


/*
for loop syntax

for (initialization condition; testing condition; increment/decrement)
	{
		statement(s)
	}

i++ is nothing i=i+1; increement operator
i-- is i=i-1 - decreement operatopr

 i++ and ++i are very similar but not exactly the same. Both increment the number, but ++i increments the number before the current expression is evaluted, 
 whereas i++ increments the number after the expression is evaluated.

int i = 3;
int a = i++; // a = 3, i = 4
int b = ++a; // b = 4, a = 4
*/
