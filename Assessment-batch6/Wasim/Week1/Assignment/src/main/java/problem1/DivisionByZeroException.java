package main.java.problem1;

public class DivisionByZeroException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DivisionByZeroException() {

		super("Division by zero not allowed");
	}
}
