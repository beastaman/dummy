package com.sapient.week1.ArithmeticOperation;

public abstract class Arithmetic {
	protected int num1, num2, num3;
	
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void display() {
		System.out.println("Operands are : " + num1 + " and " + num2 + "\nresult is : " + num3);
	}
	
	public abstract void calculate();
}

class Add extends Arithmetic {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.num3 = this.num1 + this.num2;
	}
	
}

class Sub extends Arithmetic {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.num3 = this.num1 - this.num2;
	}
	
}

class Mul extends Arithmetic {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.num3 = this.num1 * this.num2;
	}
	
}

class Div extends Arithmetic {
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		try {
			if(this.num2 == 0) 
				throw new DividedByZeroException();
			this.num3 = this.num1 / this.num2;
		} catch (DividedByZeroException e) {
			System.out.println(e.getMessage());
		}
	}
	
}