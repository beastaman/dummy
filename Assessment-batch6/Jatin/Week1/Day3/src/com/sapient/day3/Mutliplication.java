package com.sapient.day3;

public class Mutliplication implements Operation {
	private int a;
	private int b;

	public Mutliplication(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return a * b;
	}

}
