package CalculatorApp;

public abstract class Arithmetic {
	int num1,num2;
	double num3;
	
	public Arithmetic(int num1, int num2) {
		super();
		setData(num1,num2);
	}
	public void setData (int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void display() {
		System.out.println(" num1: "+num1+" num2: "+num2+" num3: "+num3);
	}
	public abstract void calculate();
}
