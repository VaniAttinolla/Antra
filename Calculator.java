package assignment_exception;

import java.util.Scanner;

class ArithmaticException extends Exception{

	public ArithmaticException() {
		super();
		
	}

	public ArithmaticException(String message) {
		super(message);
		
	}
	
	
}
public class Calculator  {
	public int a;
	public int b;
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void add() throws ArithmaticException {
		
		try {
			if(a<0 || b<0) {
				throw new ArithmaticException("ArithmaticException");
				
			}
				int c=a+b;
				System.out.println("addition of two numbers" + c);
			}
		
		catch(Exception e) {
			System.out.println(e);
			System.out.println("the numbers provided only positive values");
			
		}
	}
	public void sub() throws ArithmaticException {
		try {
			if(a<0 || b<0) {
				throw new ArithmaticException("Arithmatic Exception");
			}
				int d=a-b;
				System.out.println("subtraction of two numbers "+ d);
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("the numbers provided only positive values");
			}
	}
	public void mul() throws ArithmaticException {
		try {
			if(a==0 || b==0 ) {
				throw new ArithmaticException("Arithmatic Exception");
			}
			int d=a*b;
			System.out.println("multiplication of two numbers "+ d);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("dont provide the zero values");
		}
	}
	public void div() throws ArithmaticException {
		try {
			if(a==0 || b==0) {
				throw new ArithmaticException("Arithmatic Exception");
			}
			int n=a/b;
			System.out.println("division of two numbers "+ n);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("dont provide the zero values");
		}
		
	}
	public static void main(String[] args) throws ArithmaticException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input1 value");
		int input1=sc.nextInt();
		System.out.println("enter the input2 value");
		int input2=sc.nextInt();
		Calculator c=new Calculator(input1,input2);
		
		c.add();
		c.sub();
		c.mul();
		c.div();
		sc.close();
	}

	
		
	
	
		
}
	


