package assignment2;

public class Question13c {
	int m1(){
		try {
		 System.out.println("ABC");
		 int x = 1/0;
		 return 50;
		 }
		catch(ArithmeticException ae)
		{
		 System.out.println("I am in catch block");
		 return 40;
		 }
		finally{
		 return 60;
		 }
		}
		public static void main(String[] args)
		{ 
		Question13c t = new  Question13c();
		System.out.println(t.m1());
		}

}
