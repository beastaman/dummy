package com.example.demo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class ArithmeticValidation {

	@Before("execution (* *.*(Double,Double))")
	public void validate(Joinpoint joinpoint) {
//		for(Joinpoint a:joinpoint.ge)
	}
}
