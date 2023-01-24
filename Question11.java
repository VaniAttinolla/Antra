package assignment2;

public class Question11 {
	public static void main(String[] args) throws Exception
	{ 
	try {
	 System.out.println("ABC");
	 int x = 1 / 0;
	 }
	catch(ArithmeticException ae){
	 System.out.println("PQR");
	 System.exit(0);
	}
	finally {
	 System.out.println("XYZ");
	 }
	 }//ans:ABC,PQR.
	}



