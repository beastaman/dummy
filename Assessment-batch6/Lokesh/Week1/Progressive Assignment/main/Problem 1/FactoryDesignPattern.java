package com.week1.Problem1;

public class FactoryDesignPattern {
	
	public Arithmetic getInstance(Character ch) {
		if(ch == '+') return new Add();
		else if(ch == '-') return new Sub();
		else if(ch == '*') return new Mul();
		else if(ch == '/') return new Div();
		return null;
	}
}
