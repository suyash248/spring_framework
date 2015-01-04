package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.springinaction.springidol.Performer.*(..))")
	public void performance(){}
	
	@Around("performance()")
	public Object myAroundAdvice(ProceedingJoinPoint pjp){
		Object returnedValue=null;
		try{
			System.out.println("Before advice");
			returnedValue=pjp.proceed();
			System.out.println("After returning advice");
		}catch(Throwable ex){
			System.out.println("After throwing advice");
		}
		System.out.println("After advice");
		System.out.println("Reutrned Value : "+returnedValue);
		return returnedValue;
	}
	
}