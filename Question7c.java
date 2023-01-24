package assignment2;

public class Question7c {
	public static void main(String[] args)
	{ 
	try {
	 method();
	 System.out.println("I am in try block");
	 }
	catch(Exception e){
	 System.out.println("I am in catch block");
	}
	finally {
	 System.out.println("I am in finally block");
	 }
	}
	static void method() throws Exception {
	try {
	 int a[] = {10, 20, 30, 40};
	 a[4] = 20;
	 System.out.println(a[4]);
	try {
	 int x = 1/0;
	 System.out.println(x);
	 }
	catch(ArithmeticException ae){
	 System.out.println("I am in inner catch block"); 
	 }
	}
	catch (ArrayIndexOutOfBoundsException ae) {
	 System.out.println("I am in outer catch block");
	}
	 }//we will get the ArrayOutOfBoundsException and that executes the statement
	  //and print try block statement and print the finally block statement.


}
