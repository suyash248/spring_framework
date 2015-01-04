package spring21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("abc.xml");
		B b=(B)ctx.getBean("b");
		A a=b.getAa();
		a.fun();
	}
}
