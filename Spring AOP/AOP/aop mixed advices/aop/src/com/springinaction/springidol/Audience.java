package com.springinaction.springidol;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeats() {			// before advice
		System.out.println("BEFORE ADVICE : The audience is taking their seats and turning off their cellphones");
	}
//	public void turnOffCellPhones() {		// before advice
//		System.out.println("BEFORE ADVICE : The audience is turning off their cellphones");
//	}
	public void applaud() {		// after advice
		System.out.println("AFTER ADVICE : CLAP CLAP CLAP CLAP CLAP");
	}
	public void leaveSeats(JoinPoint jp,Object result){	// after returning advice
		System.out.println("AFTER RETURNING ADVICE : The audience is leaving their seats");
		System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Result in advice: "+result);  
	}
	public void demandRefund(JoinPoint jp, Throwable error) {		// after throwing advice
		System.out.println("AFTER THROWING ADVICE : Boo! We want our money back! from demandRefund");
		System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Exception is: "+error);  
	}
	public void performaceDuration(ProceedingJoinPoint joinpoint){	// around advice
		try {
				long start = System.currentTimeMillis();
				joinpoint.proceed();
				long end = System.currentTimeMillis();
				System.out.println("AROUND ADVICE : Duration= " + (end - start)+ " milliseconds.");
			} catch (Throwable t) {
				System.out.println("AFTER THROWING ADVICE : Boo! We want our money back! from performanceDuration");
			}
	}
}