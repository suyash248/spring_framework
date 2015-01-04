package com.soni.service;

public class MyBeanFactory {

	public Object getBean(String beanName){
		if(beanName.equals("circle"))
			return new CircleProxy();
		if(beanName.equals("square"))
			return new SquareProxy();
		return null;
	}
	
	
}
