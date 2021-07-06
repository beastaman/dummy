package com.week1.Assignment1;

public class FactoryDP {
	
	public Arithmetic getInstance(Character ch) {
		if(ch == '+') return new Add();
		else if(ch == '-') return new Sub();
		else if(ch == '*') return new Mul();
		else if(ch == '/') return new Div();
		return null;
	}
}
