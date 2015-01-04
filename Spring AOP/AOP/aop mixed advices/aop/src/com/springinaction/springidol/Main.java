package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {  
		context = new ClassPathXmlApplicationContext("abc.xml");  
		Performer performer=(Performer)context.getBean("performer"); 
		System.out.println("CASE-1");
		try{
			performer.validateAge(10);
		}catch(Exception ex){
			System.out.println("Invalid Artist : "+ex);
		}
		
		System.out.println("\nCASE-2");
		try{
			performer.validateAge(20);
		}catch(Exception ex){
			System.out.println("Invalid Artist : "+ex);
		}
	}
}
