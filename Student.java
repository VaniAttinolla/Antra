package oops;

public class Student {
	public static void greet(String name) {
		System.out.println(  "Hello" + name);
	}
	public static void greet() {
		System.out.println("Hello");
		greet("Sana");
	}
	public static void main(String[] args) {
		//Student s=new Student();
		greet();
	}
}
