package com.week1.day4.designPattern;

public interface AdapterInterface {

	public void f1();

	public void f2();

	public void f3();
}

class Adaptar1 implements AdapterInterface {

	@Override
	public void f1() {

	}

	@Override
	public void f2() {

	}

	@Override
	public void f3() {

	}

}

class Actual extends Adaptar1 {

	@Override
	public void f1() {
		System.out.println("I'm in F1");
	}

}
