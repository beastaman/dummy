package assignment.sapient.week1.q1.logic;

public abstract class Arithmetic {
	
	protected int num1, num2;
	protected double num3;
	
	
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void display() {
		System.out.println(String.format("Number 1 = %d \t Number 2 = %d \t Result = %f", 
				this.num1, this.num2, this.num3));
	}
	
	public double getResult() {
		return this.num3;
	}
	
	public abstract void calculate() throws DivideByZeroException;
	
}
