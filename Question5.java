package assignment_exception;

public class Question5 {
	  void f1()
	     {
	         try
	         {
	             int x=10,y=0,z;
	             int a[ ]={12,35,8,46};
	             System.out.println(a[6]);
	             z=x/y;
	         }
	         catch(Exception e)
	         {    
	            System.err.println(e.getMessage());     
	         }     
	     }
	  public static void main(String[] args) {
		Question5 q1=new Question5();
		q1.f1();//ans: 6 because we have print message
	}


}
