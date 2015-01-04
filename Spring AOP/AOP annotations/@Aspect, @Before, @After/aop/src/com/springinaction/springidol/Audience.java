package com.springinaction.springidol;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.springinaction.springidol.Performer.*(..))")
	public void performance(){}
	
	@Before("performance()")
	public void takeSeats() {			// before advice
		System.out.println("BEFORE ADVICE : The audience is taking their seats and turning off their cellphones");
	}
	
	@Before("performance()")
	public void turnOffCellPhones() {		// before advice
		System.out.println("BEFORE ADVICE : The audience is turning off their cellphones");
	}
	
	@After("performance()")
	public void applaud() {		// after advice
		System.out.println("AFTER ADVICE : CLAP CLAP CLAP CLAP CLAP");
	}
	
}