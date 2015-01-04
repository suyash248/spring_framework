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
	public void takeSeats(JoinPoint jp) {			// before advice
		System.out.println("BEFORE ADVICE : The audience is taking their seats and turning off their cellphones");
		System.out.println("Pointcut info : "+jp.toString());
		Performer performer=(Performer)jp.getTarget();	// returns the object of the class which causes takeSeats() method to be called.
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
	
}