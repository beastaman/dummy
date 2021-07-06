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
	
	@Before("execution (* *.*(Double,Double))")  //* means  any package next * means any class and next * means any method 
	public void validate( JoinPoint joinPoint )  throws Exception
	{
		for(Object x: joinPoint.getArgs())
		{
			Double a =  (Double)x;
			if(a<0)
			{
				throw new IllegalArgumentException("negative value is not allowed.");
			}
			else if(a>1000.0)
			{
				throw new IllegalArgumentException("Maximum value allowed is 1000.");
			}
		}
	}
}
