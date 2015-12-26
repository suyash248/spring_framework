package com.javabeat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	private static ApplicationContext ctx;

	public static void main(String args[]) {
		ctx = new ClassPathXmlApplicationContext(
				"abc.xml");

		// 1. Retrieve the bean 'p1' from Context
		System.out.println("Looking up 'p1'");
		Person p1 = ctx.getBean("p1", Person.class);

		// 2. Retrieve the bean 'p1' from Context again
		System.out.println("Looking up 'p1' again");
		Person p2 = ctx.getBean("p1", Person.class);
		// 3. The beans retrieved in step 1 and 2 should be same.
		System.out.println("p1 = " + p1.toString());
		System.out.println("p2 = " + p2.toString());

		// 4. Trigger the Clearing of bean.
		System.out.println("======================================================");
		System.out.println("Clearing the beans...");
		MyScope myScope = ctx.getBean("myScope", MyScope.class);
		myScope.clearBean();
		System.out.println("Clear Bean Completed.");
		System.out.println("======================================================");

		// 4. Retrieve the bean 'p1' from Context after clearing
		System.out.println("Looking up 'p1'");
		Person p3 = ctx.getBean("p1", Person.class);

		// 5. Retrieve the bean 'p1' from Context again after clearing
		System.out.println("Looking up 'p1' again");
		Person p4 = ctx.getBean("p1", Person.class);

		// 6. The beans retrieved in step 4 and 5 should be same.
		System.out.println("p3 = " + p3.toString());
		System.out.println("p4 = " + p4.toString());

	}
}