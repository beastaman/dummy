package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticImplementation implements Arithmetic {

	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a+b;
		
	}

	public Integer subtract(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public Integer multiply(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public Integer divide(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
