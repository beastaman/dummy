package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class ArithmeticValidation {
	
	
	@Before("execution (* *.*(Integer, Integer))")// ***, package,class, method
	public void validate(JoinPoint joinPoint) throws Exception {
		for(Object x: joinPoint.getArgs()) {
			Integer a =(Integer)x;
			if(a<0) {
				throw new IllegalArgumentException("Negative value not allowed");
			}
		}
	};
}
