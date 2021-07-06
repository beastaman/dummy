package assignment.sapient.week1.q1.logic;

public class ArithmeticRunner {
	
	private ArithmeticRunner() {
		// no instance can be created
	}
	
	public static void calculate(int num1, int num2, int choice) throws DivideByZeroException {
		Arithmetic arithmeticOperator = ArithmeticFactory.getArithmeticOperator(choice);
		
		arithmeticOperator.setData(num1, num2);
		arithmeticOperator.calculate();
		arithmeticOperator.display();
	}

}
