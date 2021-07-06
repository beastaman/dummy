package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class ArithmeticAscpect {
	@Before("execution (* *.*(Double,Double))")
	public void validate(JoinPoint joinPoint)throws Exception {
		for (Object x:joinPoint.getArgs()) {
			Double a=(Double) x;
			if (a<0) {
				throw new IllegalArgumentException("Negative value is not allowed");
			}
		}
	}
}
