package com.soni.aspect;

public class LoggingAspect {
	
	// Before Advice
	public void beforeDrawing(){
		System.out.println("BEFORE ADVICE : Best of luck");
	}
	
	// After Advice
	public void wish() {	
		System.out.println("AFTER ADVICE : Congrats");
	}
}
