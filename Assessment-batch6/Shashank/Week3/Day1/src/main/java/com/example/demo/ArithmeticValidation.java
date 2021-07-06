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
	
	@Before("execution (* *.*(Double,Double))")
	public void Validate(JoinPoint joinPoint) throws Exception {
		
		for(Object x:joinPoint.getArgs()) {
			Double a =(Double )x;
			if(a<0) {
				throw new IllegalArgumentException("Negative expression not allowed");
			}
			else if(a>1000) {
				throw new IllegalArgumentException("MAx value 1000 allowed");
				
				
			}
		}
	}
	
	

}
