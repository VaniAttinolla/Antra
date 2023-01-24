package assignment2;

public class Question2 {
	public static void main(String[] args)
	{
	try {
	 int value = 5;
	 if (value < 10)
	 throw new RuntimeException("Value is less than 10");
	 }
	catch (RuntimeException re) {
	 System.out.println(re.getMessage());
	 }
	System.out.println("Outside try-catch block");
	 }//ans:value is less than 10,and outside try-catch block
	}



