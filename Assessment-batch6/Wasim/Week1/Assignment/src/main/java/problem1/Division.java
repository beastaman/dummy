package main.java.problem1;

public class Division extends Arithmetic {

	Division() {

	}

	Division(double num1, double num2) {
		setData(num1, num2);
	}

	@Override
	public void calculate() throws DivisionByZeroException {
		if (this.getNum2() == 0) {
			throw new DivisionByZeroException();
		}
		this.setNum3(this.getNum1() / this.getNum2());
	}

	// For Lambda Expression
	@Override
	public void calculate(Calculator calculator) throws DivisionByZeroException {
		if (this.getNum2() == 0) {
			throw new DivisionByZeroException();
		}
		this.setNum3(calculator.calculate(getNum1(), getNum2()));
	}
}
