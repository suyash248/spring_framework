package com.soni;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soni.service.MyBeanFactory;
import com.soni.service.Shape;

public class Main {
	private static MyBeanFactory myBeanFactory = new MyBeanFactory();
	public static void main(String[] args) {
		
		Shape shape = null;
		shape = (Shape)myBeanFactory.getBean("circle");
		shape.draw();
		System.out.println("*****************************************************************************");
		shape = (Shape)myBeanFactory.getBean("square");
		shape.draw();
	}
}
