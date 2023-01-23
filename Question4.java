package assignment_exception;

public class Question4 {
	  void f1()
	     {
	         try
	         {
	             int x=10,y=0;
	            int n=x/y;
	         }
	         catch(Exception e)
	         {
	             e.printStackTrace();
	         }
	     }
	  public static void main(String[] args) {
		Question4 q=new Question4();
		q.f1();//Arithmetic Exception
	}


}
