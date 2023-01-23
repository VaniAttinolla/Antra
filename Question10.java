package assignment_exception;

public class Question10 {
	   void f1()
	     {
	         try
	         {
	             int a[ ]={12,35,8,46};
	             System.out.println(a[6]);
	         }
	         catch(ArrayIndexOutOfBoundsException ae)
	         {
	             System.err.println(ae);
	         }
	         try
	         {
	             String s="sathya Technologies";
	             System.out.println(s.charAt(15));
	         }
	         catch(StringIndexOutOfBoundsException se)
	         {
	             System.err.println(se);
	         }
	     }
	   public static void main(String[] args) {
		Question10 q=new Question10();
		q.f1(); //ans: ArrayoutboundException and print g.
		
	}


}
