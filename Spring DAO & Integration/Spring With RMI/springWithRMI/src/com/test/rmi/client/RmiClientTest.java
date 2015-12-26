package com.test.rmi.client;

import java.util.Iterator;
import java.util.List;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.rmi.common.*;

public class RmiClientTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myClient.xml");
		
		DeliveryServiceIntf deliveryService=(DeliveryServiceIntf)ctx.getBean("deliveryService");
		
		deliveryService.newDelivery(new Delivery("Suyash",new Date()));
		deliveryService.newDelivery(new Delivery("Abhi",new Date()));
		deliveryService.newDelivery(new Delivery("Sunny", new Date()));
		
		List deliveries=deliveryService.getDeliveries();
		System.out.println("Total number of deliveries = "+deliveries.size());
		Iterator it=deliveries.iterator();
		while(it.hasNext()){
			Delivery delivery=(Delivery)it.next();
			System.out.println("\n"+delivery);
		}
	}
}
