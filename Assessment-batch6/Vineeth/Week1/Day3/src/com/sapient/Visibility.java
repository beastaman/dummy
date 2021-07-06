package com.sapient;

public class Visibility {

	private int a1;
	int a2;
	protected int a3;
	public int a4;

	private void f1() {
		System.out.println("I am in f1");
	}

	void f2() {
		System.out.println("I am in f2");
	}

	protected void f3() {
		System.out.println("I am in f3");
	}

	public void f4() {
		System.out.println("I am in f4");
	}
}
