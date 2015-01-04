package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {  
		context = new ClassPathXmlApplicationContext("abc.xml");  
		Thinker thinkerImpl=(Thinker)context.getBean("thinkerImpl"); 
		thinkerImpl.thinkOfSomething("Wanna be a java developer");
		
	}
}
