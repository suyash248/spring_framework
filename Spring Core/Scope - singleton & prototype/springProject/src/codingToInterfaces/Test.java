package codingToInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		Shape shape = null;
		Point point = null;
		context=new ClassPathXmlApplicationContext("abc.xml"); 
		
		point = (Point)context.getBean("point");		// 'point' has x=1 & y=2
		point.setX(1);
		point.setY(2);
		
		// Point bean has singleton scope so we'll get previous instance of Point here. Hence the values of x & y will be there.
		point = (Point)context.getBean("point");		
		System.out.println("X : " + point.getX() + "\nY : "+ point.getY());
		shape=(Shape)context.getBean("circle");
		shape.draw();
	}
}
