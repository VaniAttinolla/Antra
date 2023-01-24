package assignment2;

public class Test12 {
	public static void main(String[] args)
	{
	 System.out.println("111"); 
	try 
	{ 
	 int x = 12/0; 
	 System.out.println("Result of x: " +x); 
	 System.out.println("333"); 
	 } 
	catch(ArithmeticException ae) 
	{ 
	 System.out.println("Hello world"); 
	 } 
	 System.out.println("444"); 
	 }//print the 111 and Hello World and 444 because inside try block exception is occurs program is terminated
	    // after handle the exception print the catch block statement after remaining code was Executed.


}
