package javaBasicsArrays;

public class SingleDimensionalArray {
	
	public static void main (String args[])
	{
		
		
		String text="Munny";
		System.out.println(text);
		
		
		String text1[]= {"Munny","Kiran","Kumar","Vijay","Ajay","Shashwath"};
		//to print the total values in the array
		System.out.println(text1.length);
		
		System.out.println(text1[0]);
		
		//to print vijay
		System.out.println(text1[3]);
		System.out.println("...............................................");
		
		for(int i=0;i<text1.length;i++) {
			System.out.println(text1[i]);
		}
	}
	
	
}


/*
 Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. 
 An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type. 
  
*/