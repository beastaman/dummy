package p1;

public class ArithmeticOperationFactory {

	public static ArithmeticOperation getArithmeticOperation(int choice, int num1, int num2) {
		
		switch (choice) {
			case 1:		return new Addition(num1, num2);
			case 2:		return new Subtraction(num1, num2);
			case 3:		return new Multiplication(num1, num2);
			case 4:		return new Division(num1, num2);
			default:	return null;
		}
	}
}
