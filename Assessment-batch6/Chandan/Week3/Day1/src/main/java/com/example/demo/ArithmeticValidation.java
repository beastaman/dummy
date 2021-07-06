package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0) //Waving or Indexing
public class ArithmeticValidation {
	
	// @Before is called advise; execution is called Advise Crosscut - function Signature
	// * - any package, *- any class, *- any method
	@Before("execution (* *.*(Double, Double))")
	public void validate(JoinPoint joinPoint) throws Exception {
		
		System.out.println("HI");
		
		for(Object x: joinPoint.getArgs()) {
			Double a = (Double) x;
			if(a<0) {
				throw new IllegalArgumentException("Negative Values not allowed");
			}
		}
		
		
	}
	
	@AfterReturning(pointcut = "within(com.example.demo.*)", returning = "returnVal")
	public void valReturn(Object returnVal) {
		
		
		System.out.println("returned: " + returnVal );
		
		
	}
	
	
}
