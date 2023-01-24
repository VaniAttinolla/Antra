package assignment2;

public class Question3 {
	public static void main(String[] args)
	{
	try {
	 int value = 20;
	 if (value < 10)
	 throw new RuntimeException("Value is less than 10");
	 }
	catch (RuntimeException re) {
	 System.out.println(re.getMessage());
	 }
	System.out.println("Outside try-catch block");
	 }//there is no exception print the outside try-catch block

}
