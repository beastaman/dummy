package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class ArithmaticValidation {
	
	@Before("execution (* *.*(Double,Double))")
	public void validation(JoinPoint joinPoint)
	{
		for(Object x : joinPoint.getArgs()) 
		{
			Double a = (Double) x;
			if(a < 0) {
				throw new IllegalArgumentException("Negative value is not allowed");
			}
			else if(a > 1000.0) {
				throw new IllegalArgumentException("Max value allowed is 1000");
			}
		}

	}

}
