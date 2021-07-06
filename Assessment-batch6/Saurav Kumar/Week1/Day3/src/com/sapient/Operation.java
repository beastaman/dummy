package com.sapient;

public abstract class Operation {
	
	protected int a, b;
	
	public Operation(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setNumbers(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int getResult();
}

class Add extends Operation {

	public Add(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getResult() {
		return this.a+this.b;
	}
	
	public void m1( ) {
		System.out.println("this is add method");
	}
}

class Subtract extends Operation {

	public Subtract(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getResult() {
		return this.a - this.b;
	}
	
}


class Multiply extends Operation {

	public Multiply(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getResult() {
		return this.a * this.b;
	}
	
}

class Divide extends Operation {

	public Divide(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getResult() {
		return this.a / this.b;
	}
	
}




