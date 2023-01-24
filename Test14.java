package assignment2;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("111");
		try {
			System.out.println("222");
			double y = 77.0 / 0;
			//System.out.println(y);
		} catch (ArithmeticException e) {
			try {
				System.out.println("Hello");
				int x = 20 / 0;
			} catch (NullPointerException np) {
				System.out.println("333");
			}
		}
		System.out.println("444");//ans:print 111 222 444 because double value divide by zero we got the infinity so infinity is not a exception 
		                          //jvm not goto catch block afetr remaining code executed.s
	}

}
