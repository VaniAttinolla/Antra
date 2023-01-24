package assignment2;

public class Question13a {
	int m1() {
		try {
		 System.out.println("ABC");
		 return 50;
		 }
		catch(Exception e)
		{
		 System.out.println("I am in catch block");
		 }
		return 10;
		}
		public static void main(String[] args)
		{ 
		Question13a t = new Question13a();
		System.out.println(t.m1());
		 }
		}//ABC ,50

