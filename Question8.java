package assignment2;

public class Question8 {
	public static void main(String[] args) throws Exception
	{ 
	try {
	 System.out.println("ABC");
	 int x = 1/0;
	 System.out.println("PQR");
	try {
	 System.out.println("XYZ");
	 }
	catch(ArithmeticException ae) {
	 System.out.println("I am in inner catch block"); 
	 }
	}
	catch (ArrayIndexOutOfBoundsException ae) {
	 System.out.println("I am in outer catch block");
	 }
	 }//ans:ABC ArithmeticException

}
