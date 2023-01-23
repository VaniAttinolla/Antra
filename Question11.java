package assignment_exception;

public class Question11 {
	  void f1()
	     {
	        // try
	         {
	             int x=10,y=0,z;
	             z=x/y;
	         }
	        try
	         {
	             int a[ ]={12,35,8,46};
	             System.out.println(a[6]);
	         }
	         catch(Exception e)
	         {
	             System.err.println(e);
	         }
	     }
	  public static void main(String[] args) {
		Question11 q=new Question11();
		q.f1();//ans :compile time exception
	}


}
