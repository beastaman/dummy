package com.sapient.demo2;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

// If there are multiple aspects, which should work?
@Aspect
@Order(0)
public class ArithmeticValidation {

    // crosscut
    // before := advice
    // *.* --> any package, any class, any method.
    @Before("execution (* *.*(Double, Double))")
    public void validate(Joinpoint joinpoint) {
        for (Object x : joinpoint.getArgs()) {
            Double a = (Double) x;
            if (a < 0) throw{
                throw new IllegalArgumentException("Values can't be negative");
            };
        }
    }
}
