package com.springinaction.springidol;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.springinaction.springidol.Performer.*(..))")
	public void performance(){}
	
	
	@After("performance()")
	public void applaud() {		// after advice
		System.out.println("AFTER ADVICE : CLAP CLAP CLAP CLAP CLAP");
	}

	@AfterReturning(pointcut="args(name,age)" , returning="returnedValue")
	public void leaveSeats(String name, int age, String returnedValue){	//change Object returnedValue					// after returning advice
		System.out.println("AFTER RETURNING ADVICE : The audience is leaving their seats And returned Value="+returnedValue);
	}
	
	@AfterThrowing(pointcut="args(name,age)" , throwing="exc")
	public void demandRefund(String name, int age, RuntimeException exc) {// It will be invoked only if pointcut expression matches and RuntimeException is thrown		// after throwing advice
		System.out.println("AFTER THROWING ADVICE : Boo! We want our money back! from demandRefund And the exception is : "+exc.toString());	// Replace RuntimeException to Exception then it will AfterReturining will be applied in all cases where pointcut expression matches no matter what type of exception is thrown
	}
//	public void performaceDuration(ProceedingJoinPoint joinpoint){	// around advice
//		try {
//				long start = System.currentTimeMillis();
//				joinpoint.proceed();
//				long end = System.currentTimeMillis();
//				System.out.println("AROUND ADVICE : Duration= " + (end - start)+ " milliseconds.");
//			} catch (Throwable t) {
//				System.out.println("AFTER THROWING ADVICE : Boo! We want our money back! from performanceDuration");
//			}
//	}
}