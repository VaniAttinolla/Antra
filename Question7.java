package assignment_exception;

public class Question7 {
	  void f1()
	     {
	         try
	         {
	             String s="sathya Technologies";
	             System.out.println(s.charAt(15));
	         }
	         catch(ArrayIndexOutOfBoundsException ae)
	         {
	             System.err.println(ae);
	         }
	         catch(StringIndexOutOfBoundsException se)
	         {
	             System.err.println(se.toString());
	         }
	     }
	  public static void main(String[] args) {
		Question7 q= new Question7();
		q.f1();//ans:g
	}


}
