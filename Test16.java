package assignment2;

public class Test16 {
	public static void main(String[] args)
	{
	System.out.println("111"); 
	try 
	{ 
	 System.out.println("222"); 
	 } 
	catch(ArithmeticException e) 
	{ 
	try 
	{ 
	 double x = 2/0; 
	 } 
	catch(NullPointerException np) 
	{ 
	 } 
	} 
	System.out.println("ABC"); 
	 }//ans : 111 222 ABC inside there is no exception.


}
