package codingToInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("abc.xml"); 
		Shape shape=(Shape)context.getBean("circle");
		shape.draw();
	}
}
