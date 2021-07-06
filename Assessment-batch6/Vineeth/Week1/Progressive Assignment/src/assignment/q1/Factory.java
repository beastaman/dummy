package assignment.q1;

public class Factory {

	public static Arithmetic getArithmetic(double num1, double num2, int choice) {
		
		Arithmetic[] ops = new Arithmetic[5];

		ops[1] = new Add(num1, num2);
		ops[2] = new Sub(num1, num2);
		ops[3] = new Mul(num1, num2);
		ops[4] = new Div(num1, num2);
		
		return ops[choice];
	}

}
