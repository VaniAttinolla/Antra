package assignment2;

public class Question7b {
	
	public static void main(String[] args)
	{ 
	try {
	 method();
	 System.out.println("I am in try block");
	 }
	catch (RuntimeException ex) {
	 System.out.println("RuntimeException in main");
	}
	catch (Exception ex) {
	 System.out.println("Exception in main");
	 }
	}
	static void method() throws Exception {
	try {
	 int a[] = {10, 20, 30, 40};
	 a[10] = 5;
	}
	catch (ArrayIndexOutOfBoundsException ae) {
	 System.out.println("ArrayIndexOutOfBoundsException in method()");
	}
	catch (RuntimeException re) {
	 System.out.println("RuntimeException in method()");
	}
	catch (Exception e) {
	 System.out.println("Exception in method()");
	 }//ans:ArrayIndexOutOfBoundsException in method() and i' am in try block.
	 }

}
