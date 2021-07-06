package p1;

public class Multiplication extends ArithmeticOperation {

	public Multiplication(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.result = this.number1 * this.number2;
	}
}
