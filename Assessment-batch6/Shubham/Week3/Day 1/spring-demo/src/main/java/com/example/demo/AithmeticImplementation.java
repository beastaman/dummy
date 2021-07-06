package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AithmeticImplementation implements IArithmetic{

	@Override
	public Double add(Double a, Double b) {
		// TODO Auto-generated method stub
		
		return a+b;
	}

	@Override
	public Double sub(Double a, Double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Double mul(Double a, Double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public Double div(Double a, Double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	
}
