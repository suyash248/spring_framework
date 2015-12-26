package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {  
		context = new ClassPathXmlApplicationContext("abc.xml");  
		Performer performer=(Performer)context.getBean("performer"); 
		
		try{
			System.out.println("ARTIST ; 1");
			performer.validateAge(20);
		}catch(Exception ex){
			System.out.println("Invalid Artist : "+ex);
		}
		System.out.println("AFTER THROWING ADVICE : Boo! We want our money back!");
		try{
			System.out.println("ARTIST ; 2");
			performer.validateAge(10);
		}catch(Exception ex){
			System.out.println("Invalid Artist : "+ex);
		}
		
		
	}
}
