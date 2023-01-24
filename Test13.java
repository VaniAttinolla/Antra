package assignment2;

public class Test13 {
	int x = 30, y = 0; 
	void divide() 
	{ 
	 System.out.println("I am in method"); 
	try 
	{ 
	 System.out.println("I am in try block"); 
	 int z = x/y; 
	 System.out.println("Result of z: " +z); 
	} 
	catch(NullPointerException np) 
	{ 
	 System.out.println("I am in catch block"); 
	 } 
	}
	public static void main(String[] args)
	{
	 Test13 t = new Test13();
	 t.divide();
	 }//ans:I am in method and I am in try block remaining code was terminated because 
	 //catch block was not handle the arithmetic exception.


}
