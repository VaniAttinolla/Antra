package assignment_exception;

public class Question6 {
	  void f1()
	     {
	         try
	         {
	             int x=10,y=0,z;
	             z=x/y;
	         }
	         finally
	         {
	             System.err.println("hello");
	         }
	     }
	  public static void main(String[] args) {
		Question6 q=new Question6();
		q.f1();//ans: giving 0 print hello and Arithmetic Exception 
		       // and giving 2 print hello
	}


}
