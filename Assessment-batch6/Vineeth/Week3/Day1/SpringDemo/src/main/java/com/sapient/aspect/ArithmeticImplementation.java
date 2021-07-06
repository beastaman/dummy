package com.sapient.aspect;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticImplementation implements ArithmeticInterface {

	@Override
	public Double add(Double a, Double b) {
		return a + b;
	}

	@Override
	public Double sub(Double a, Double b) {
		return a - b;
	}

	@Override
	public Double mul(Double a, Double b) {
		return a * b;
	}

	@Override
	public Double div(Double a, Double b) {
		return a / b;
	}

}
