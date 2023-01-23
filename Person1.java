package oops;

public class Person1 implements Comparable <Person1> {
	private String name;
	 private int age;
	 public Person1(String name, int age)
	 {
	 this.name = name;
	 this.age = age;
	 }
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Person1 other)
	 {
		 if(this.age==other.age) {
			 return 0;
		 }
		 else
			 return this.age>other.age?1:-1;
	   
	 }
	 public static void main(String[] args)
	 {
	 Person1 p1 = new Person1("Carlos",17);
	 Person1 p2 = new Person1("Lia",18);
	 Person1 p3 = new Person1("Asraf", 17);
	 Person1 p4 = new Person1("Lia", 17);
	 Person1 p5 = new Person1("Karla", 17);
	 System.out.println(p1.compareTo(p2));
	 System.out.println(p2.compareTo(p3));
	 System.out.println(p3.compareTo(p1));
	 System.out.println(p4.compareTo(p3));
	 System.out.println(p4.compareTo(p5));
	 }
	

}
