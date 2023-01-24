package assignment2;

public class Question5 {
	public static void main(String[] args)
	{ 
	try 
	{ 
	 int[] list = new int[5];
	 System.out.println(list[5]);
	 } 
	catch(StringIndexOutOfBoundsException e) 
	{
	try {
	 System.out.println("ABC");
	 int x = 10/0;
	}
	catch(ArithmeticException ae){
	 } 
	}
	System.out.println("ABC"); 
	 }//ans:throw the ArrayOutOfboundException.


}
