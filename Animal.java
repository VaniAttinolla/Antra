package oops;

public abstract class Animal {
	public String name;
	 public int numLegs;
	 public abstract void speak();
	 public abstract void eat();
	 public static void main(String[] args)
	 {
	 Dog4 myDog = new Dog4();
	 myDog.speak();
	 myDog.eat();
	 }

}
  class Dog4 extends Animal{
	  public void speak() {
		  System.out.println("woof");
  }
	  public void eat() {
		  System.out.println("num num");
	  }
  
  
	


}

