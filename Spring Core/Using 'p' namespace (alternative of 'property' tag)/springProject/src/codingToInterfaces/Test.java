package codingToInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		Shape shape = null;
		context=new ClassPathXmlApplicationContext("abc.xml"); 
		shape = (Shape)context.getBean("circle");
		shape.draw();
		shape = (Shape)context.getBean("triangle");
		shape.draw();
	}
}
