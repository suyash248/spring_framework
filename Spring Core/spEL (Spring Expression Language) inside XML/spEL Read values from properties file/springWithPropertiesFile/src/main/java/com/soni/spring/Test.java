package com.soni.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("abc.xml"); 
		UserDetails userDetails = (UserDetails)context.getBean("userDetails");
		userDetails.displayDetails();
	}
}
