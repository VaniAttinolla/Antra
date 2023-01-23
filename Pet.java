package oops;

public class Pet
	{
	 public void brag()
	 {
	 System.out.println("I have the best pet!");
	 }
	 public static void main(String[] args)
	 {
	 Dog2 d1 = new Dog2();
	 d1.brag();
	 }
	}
	class Dog2 extends Pet
	{
	 public void brag()
	 {
	 super.brag();
	 System.out.println("I have the best dog!");
	 }
	}




