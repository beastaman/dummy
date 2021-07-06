package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class ArithmeticValidation {

	@Before("execution (* *.*(Double, Double))") // Advice-cross cut: package class method
	public void validate(JoinPoint joinpoint) throws Exception {
		for (Object x : joinpoint.getArgs()) {
			double a = (Double) x;
			if (a < 0)
				throw new IllegalArgumentException("negative values not allowed");
			else if (a > 1000)
				throw new IllegalArgumentException("Upper limit is 1000");
		}
	}
}
