package assignment2;

public class Question10 {
	public static void main(String[] args) throws Exception
	{ 
	try {
	 System.out.println("ABC");
	 System.exit(0);
	 int x = 1 / 0;
	 }
	catch(ArithmeticException ae){
	 System.out.println("PQR");
	}
	finally {
	 System.out.println("XYZ");
	 }
	 }//ans :ABC

}
