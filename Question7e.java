package assignment2;

public class Question7e {
	public static void main(String[] args) throws Exception{ 
		try {
		 method();
		 }
		finally{
		 System.out.println("I am in finally block");
		}
		}
		static void method() throws Exception {
		try {
		int[] list = new int[5];
		System.out.println(list[0]);
		try {
		 System.out.println(list[5]);
		 }
		catch(ArithmeticException ae){
		 System.out.println("I am in inner catch block"); 
		 }
		}
		catch (ArrayIndexOutOfBoundsException ae) {
		 System.out.println("I am in outer catch block");
		}
		 }//

}
