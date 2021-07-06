package p2;

import java.util.Random;

class OddNumberException extends Exception {
	
	OddNumberException() {
		super("Odd Number not accepted");
	}
	
}

public class UserDefinedExceptionDemo {

	public static String check(int n) {
		try {
			if (n%2 != 0)
				throw new OddNumberException();
			return "Even Number accepted";
		}
		catch (OddNumberException e) {
			return e.getMessage();
		}
	}

	public static void main(String[] args) {
		
		Random random = new Random();
		int n = random.nextInt(1000);
		System.out.println("Generated : " + n);
		System.out.println(check(n));
	}

}
