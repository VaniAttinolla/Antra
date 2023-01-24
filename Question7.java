package assignment2;

public class Question7 {
	public static void main(String[] args)
	{ 
	try {
	 method();
	 System.out.println("After the method call");
	 }
	catch (StringIndexOutOfBoundsException se) {
	 System.out.println("StringIndexOutOfBoundsException");
	}
	catch (RuntimeException ex) {
	 System.out.println("RuntimeException");
	}
	catch (Exception e) {
	 System.out.println("Exception");
	 }
	}
	static void method() throws Exception {
	String str = "Hello";
	char ch = str.charAt(5);
	System.out.println(ch);
	 }// ans:StringIndexOutOfBoundsException.
	}



