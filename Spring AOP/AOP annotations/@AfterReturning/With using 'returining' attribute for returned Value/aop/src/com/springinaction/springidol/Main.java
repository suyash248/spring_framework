package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {  
		context = new ClassPathXmlApplicationContext("abc.xml");  
		Performer performer=(Performer)context.getBean("performer"); 
		performer.perform("K.K.",42);
		performer.enjoy("Suyash", 21);	// After returning advice will not be applied on enjoy() because there returned value is of type "String"  but enjoy() is returning int.
	}													//  If you want AfterReturning advice to be applied on enjoy() also then you have to change the type of returned value to "Object"
}
