package assignment2;

public class Question7d {
	public static void main(String[] args){ 
		try {
		 method();
		 System.out.println("I am in try block");
		 int a = 1/0;
		 }
		catch(Exception e){
		 System.out.println("I am in catch block");
		}
		System.out.println("I am in main method");
		}
		static void method() throws Exception {
		try {
		 int a[] = {10, 20, 30, 40};
		 a[3] = 20;
		 System.out.println(a[3]);
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
		 }

}
