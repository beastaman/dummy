package com.sapient.day3;

public class Addition implements Operation {
	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return a + b;
	}

}
