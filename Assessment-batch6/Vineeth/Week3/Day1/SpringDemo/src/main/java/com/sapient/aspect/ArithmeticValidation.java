package com.sapient.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class ArithmeticValidation {

	@Before("execution (* *.*(Double,Double))") // Cross-Cut
	public void validate(JoinPoint joinPoint) {
		
		for(Object x : joinPoint.getArgs()) {
			Double a = (Double) x;
			if(a < 0)
				throw new IllegalArgumentException("Argument can't be negative");
			if(a > 1000)
				throw new IllegalArgumentException("Argument must be less than 1000");
		}
	}
}
