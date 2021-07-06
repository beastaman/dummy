package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticImplementation implements IArithmetic{

	@Override
	public Double Addition(Double a, Double b) {

		return a+b;
	}

	@Override
	public Double Subtraction(Double a, Double b) {
		return a-b;
	}

	@Override
	public Double Division(Double a, Double b) {
		return a/b;
	}

	@Override
	public Double Multiplication(Double a, Double b) {
		return a*b;
	}

}
