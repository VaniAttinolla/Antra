package assignment2;

public class Question6 {
	public static void main(String[] args)
	{ 
	try {
	 int[] list = new int[10];
	 System.out.println("list[10] is " + list[10]);
	 }
	catch (ArithmeticException ex) {
	 System.out.println("ArithmeticException");
	 }
	catch (RuntimeException ex) {
	 System.out.println("RuntimeException");
	 }
	catch (Exception ex) {
	 System.out.println("Exception");
	 } 
	 }// ans: ArrayOutOfBounds Exception is came but is child class of runtime exception class.
	


}
