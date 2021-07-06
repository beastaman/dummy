package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticImplementation implements Arithmetic{
	public Double add(Double a, Double b) {
		return a+b;
	}
	public Double sub(Double a, Double b) {
		return a-b;
	}
	public Double mul(Double a, Double b) {
		return a*b;
	}
	public Double div(Double a, Double b) {
		return a/b;
	}
}
