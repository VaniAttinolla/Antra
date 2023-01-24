package assignment2;

public class Test15 {
	public static void main(String[] args)
	{
	System.out.println("111"); 
	try 
	{ 
	 System.out.println("222"); 
	 int y = 1/0; 
	 } 
	catch(ArithmeticException e) 
	{ 
	try 
	{ 
	 System.out.println("Hello"); 
	 double x = 2.5/0; 
	 System.out.println("Java");
	 } 
	catch(NullPointerException np) 
	{ 
	 System.out.println("333"); 
	 } 
	} 
	System.out.println("444");
	}//ans: 111 222 Hello Java 444 print the in this program exception is there 
	// that handle the catch block  inside again try catch block is there print the Hello statement
	// after double by zero there is no exception print Java and remaining code executed.
	

}
