package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {  
		context = new ClassPathXmlApplicationContext("abc.xml");  
		Performer performer=(Performer)context.getBean("performer"); 
		performer.perform();
		performer.enjoy();
		performer.play();
	}
}
