package test1;

public class StringExample2 {

	public static void main(String[] args) {
		// static
		//StringExample2 words=new StringExample2();
		//words.stringOperationsNonStatic("Shashwath Sudhakar");
		stringOperationsStatic("Kavitha Sundar");
		
		//System.out.println(returnTextLengthStatic("Kamal Hassan"));
		//System.out.println(words.returnCharacterNonStatic("KKPK"));
		
		// can assign the value of the return method to the vartiable
		int a=returnTextLengthStatic("Satish");
		int b=returnTextLengthStatic("Palaniyappan");
		System.out.println(a+b);



	}

	
	private static void zzz(String string) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * this method is to perform string operation and its a static method
	 * @param text
	 */
	public static void stringOperationsStatic(String text) {
		
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		System.out.println(text.isEmpty());
		System.out.println(text.isBlank());
		System.out.println(text.contentEquals("Kiran"));
		System.out.println(text.contentEquals("kiran"));
		System.out.println(text.contentEquals("Kumar"));
		System.out.println(text.concat(" kumar"));
	}
	
	//Non-static
	public void stringOperationsNonStatic(String text) {
		
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		System.out.println(text.isEmpty());
		System.out.println(text.isBlank());
		System.out.println(text.contentEquals("Kiran"));
		System.out.println(text.contentEquals("kiran"));
		System.out.println(text.contentEquals("Kumar"));
		System.out.println(text.concat(" kumar"));
	}
	
	//return with static
	/**
	 * 
	 * @param text
	 * @return
	 */
	public static int returnTextLengthStatic(String text) {
		
		return text.length();
	}
	
	//return with non-static
	public  char returnCharacterNonStatic(String text) {
		
		return text.charAt(2);
	}
}
