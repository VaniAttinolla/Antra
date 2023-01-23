package oops;

public interface Test {
	void talk();
	void walk();

}
 class Sample implements Test{
 public	void talk()
	{
		System.out.println("Talking with my friends");
	}
 public void walk() {
	 System.out.println("Walking towards the East");
 }
}
