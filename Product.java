package assignment_exception;

import java.util.Scanner;

class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		System.out.println(message);
	}

}

public class Product {
	void productCheck(int weight) throws MyException {
		if (weight >= 100) {
			System.out.println(weight);

		} else {
			throw new MyException("Product is invalid");
		}
	}

	public static void main(String[] args) throws Exception {
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight");
		int x = sc.nextInt();
		p.productCheck(x);
		sc.close();
	}

}
