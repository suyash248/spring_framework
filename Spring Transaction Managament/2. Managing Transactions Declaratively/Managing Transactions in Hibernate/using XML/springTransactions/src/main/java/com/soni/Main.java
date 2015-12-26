package com.soni;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soni.dao.BookPurchaseDao;

public class Main {
	private static ApplicationContext context;
	
	public static void main(String[] args) throws Exception {
		context=new ClassPathXmlApplicationContext("spring.xml"); 
		BookPurchaseDao bookPurchaseDao = (BookPurchaseDao)context.getBean("bookPurchaseDaoImpl");
		bookPurchaseDao.bookPurchase(1, 1, "soni1234");
	}
}
