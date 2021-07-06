package assignment.sapient.week1.q1.logic;

public class ArithmeticFactory {
	
	private ArithmeticFactory() {};
	
	public static Arithmetic getArithmeticOperator(int choice) {
		
		Arithmetic arithmetic[] = {new Add(), new Sub(), new Mul(), new Div()};
		
		return arithmetic[choice-1];
		
	}
	
}
