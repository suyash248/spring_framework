package com.springinaction.springidol;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.springinaction.springidol.Performer.*(..))")
	public void performance(){}
	
	@Before("performance()")
	public void takeSeats(JoinPoint jp) {			// before advice
		System.out.println("BEFORE ADVICE : The audience is taking their seats and turning off their cellphones");
		System.out.println("Pointcut info : "+jp.toString());
		Performer performer=(Performer)jp.getTarget();
		System.out.println("Pointcut target object : "+performer);
	}
	
	@Before("performance()")
	public void turnOffCellPhones() {		// before advice
		System.out.println("BEFORE ADVICE : The audience is turning off their cellphones");
	}
	
	@After("performance()")
	public void applaud() {		// after advice
		System.out.println("AFTER ADVICE : CLAP CLAP CLAP CLAP CLAP");
	}
	
	@Before("args(name,age)")
	public void printPerformerName(String name, int age){
		System.out.println("Perfomer name : "+name+" Performer's age : "+age);
	}
	
	
	@AfterReturning("performance()")
	public void leaveSeats(){	// after returning advice
		System.out.println("AFTER RETURNING ADVICE : The audience is leaving their seats");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {		// after throwing advice
		System.out.println("AFTER THROWING ADVICE : Boo! We want our money back! from demandRefund");
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