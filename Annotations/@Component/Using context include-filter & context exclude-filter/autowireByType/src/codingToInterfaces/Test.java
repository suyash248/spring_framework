package codingToInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static AbstractApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("abc.xml"); 
		context.registerShutdownHook();
		Shape shape=(Shape)context.getBean("circle");
		shape.draw();
	}
}