package com.sapient;

public class Visibility {

	private int a1 = 1;
	int a2 = 2;
	protected int a3 = 3;
	public int a4 = 4;

	private void f1() {
		System.out.println("Private Function");
	}

	void f2() {
		System.out.println("Default Function");
	}

	protected void f3() {
		System.out.println("Protected Function");
	}

	public void f4() {
		System.out.println("Public Function");
	}
}
