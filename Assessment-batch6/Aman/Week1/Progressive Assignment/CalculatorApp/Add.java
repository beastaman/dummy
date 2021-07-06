package CalculatorApp;

public class Add extends Arithmetic{
	public Add(int num1,int num2) {
		super(num1,num2);
	}

	@Override
	public void calculate() {
		num3=num1+num2;
	}
	
}
