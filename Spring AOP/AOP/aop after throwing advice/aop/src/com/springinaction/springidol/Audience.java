package com.springinaction.springidol;

import org.aspectj.lang.JoinPoint;

public class Audience {

	public void demandRefund(JoinPoint jp, Throwable error) {		// after throwing advice
		System.out.println("AFTER THROWING ADVICE : Boo! We want our money back!");
		System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Exception is: "+error);  
	}
}