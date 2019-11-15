package javaBasicsLoops;

public class WhileLoop {
	
	public static void main(String args[]) {
		
		WhileLoop wl= new WhileLoop();
		wl.printNumbers();
		
	}
	
	public void printNumbers( ) {
		int i=12;
		
		while(i<=10) {
			
			System.out.println("Numbers:"+i);
			i++;
			
		}
	}

}


/*
while (condition) {
  // code block to be executed
}



*/