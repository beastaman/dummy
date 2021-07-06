package com.sapient.springdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class ArithmeticValidation {

    @Before("execution(* *.*(Double, Double))") //Advice-Cross cut
    public void validate(JoinPoint joinPoint){
        for(Object o : joinPoint.getArgs()){
            Double a = (Double) o;
             if(a > 1000) throw new IllegalArgumentException("Exceeds the upper bound");
        }
    }

    @AfterReturning(value = "execution(* *.*(Double, Double))", returning = "rval")
    public void checkResultValidation(Object rval){
        Double ans = (Double) rval;
        if(ans < 0){
            throw new IllegalArgumentException("Result cannot be negative");
        }
    }
}
