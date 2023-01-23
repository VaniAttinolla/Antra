package assignment_exception;

public class Question9 {
	   void f1()
	     {
	         try
	         {
	             int x=10,y=8,z;
	             z=x+y;
	         }
	         catch(Exception e)
	         {
	             System.err.println(e);
	         }
	         finally
	         {
	             System.err.println( );
	         }
	     }
	   public static void main(String[] args) {
		Question8 q=new Question8();
		q.f1();//ans : z can not be local variable 
	}


}
