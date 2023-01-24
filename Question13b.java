package assignment2;

public class Question13b {
	int m1(){
		try {
		 System.out.println("ABC");
		 int x = 1/0;
		 return 50;
		 }
		catch(ArithmeticException ae)
		{
		 System.out.println("I am in catch block");
		 }
		return 10;
		}
		public static void main(String[] args)
		{ 
		Question13b t = new Question13b();
		System.out.println(t.m1());
		}//ABC, I am catch block,10
}
