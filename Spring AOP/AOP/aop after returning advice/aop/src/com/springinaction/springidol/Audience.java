package com.springinaction.springidol;

import org.aspectj.lang.JoinPoint;

public class Audience {

	public void leaveSeats(JoinPoint jp,Object result){	// after returning advice
		System.out.println("AFTER RETURNING ADVICE : The audience is leaving their seats");
		System.out.println("Method Signature: "  + jp.getSignature());  
	    System.out.println("Result in advice: "+result);  
	}
}