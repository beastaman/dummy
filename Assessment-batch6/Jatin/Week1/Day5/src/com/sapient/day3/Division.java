package com.sapient.day3;

public class Division implements Operation {
	private int a;
	private int b;

	public Division(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compute() {
		// TODO Auto-generated method stub
		if (b == 0) {
			System.out.println("Exception");
			return 0;
		}
		return a / b;
	}
}
