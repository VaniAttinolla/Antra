package oops;

public class Person2 {
	
		 public void speak()
		 {
		 System.out.println("I'm a person");
		 }
		 public static void main(String[] args)
		 {
		 Person2 per=new Stud();
		 per.speak();
		 }
		}
		class Stud extends Person2
		{
		 public void speak() {
			 System.out.println("I'm a student");
		 }


}
