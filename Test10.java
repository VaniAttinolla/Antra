package assignment2;

public class Test10 {
	public static void main(String[] args)
	{
	for (int i = 1; i <= 5; i++) {
	 System.out.print(i + " ");
	try {
	 int a = 10;
	 int b = 0;
	 int c = a/b;
	 System.out.println(c);
	 }
	catch (ArithmeticException ae) {
	 }//ans: 1 2 3 4 5 whyBecause try-catch block is not to the program not use of declaration.
	 }
	}}



