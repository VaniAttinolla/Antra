package assignment_exception;

public class Question8 {
	 void f1()
     {
         try
         {
             String s="sathya Technologies";
             System.err.println(s.charAt(15));
         }
       
         catch(Exception e)
         {
             System.err.println(e);
         }
        // catch(StringIndexOutOfBoundsException se)
         {
          //  System.err.println(se);
         }
      
     }
	 public static void main(String[] args) {
		Question8 q=new Question8();
		q.f1();//in this program complie time error order of giving catch block is wrong
	}

}
