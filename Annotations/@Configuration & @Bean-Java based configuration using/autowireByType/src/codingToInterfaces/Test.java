package codingToInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(PointConfig.class);
		Point pointA=(Point)context.getBean("pointA");
		Point pointB=(Point) context.getBean("pointB");
		Point pointC=(Point) context.getBean("pointC");
		
		System.out.println("PointA : x="+pointA.getX()+" y="+pointA.getY());
		System.out.println("PointB : x="+pointB.getX()+" y="+pointB.getY());
		System.out.println("PointC : x="+pointC.getX()+" y="+pointC.getY());
		
		context=new AnnotationConfigApplicationContext(CircleConfig.class, TriangleConfig.class);
		
		Shape shape=(Shape)context.getBean("triangle"); // Shape shape=(Shape)context.getBean("circle");
		if(shape instanceof Circle ){
			Circle cirOb=(Circle)shape;
			cirOb.setCenter(pointA);
		}
		if(shape instanceof Triangle ){
			Triangle triangle=(Triangle)shape;
			triangle.setPointA(pointA);
			triangle.setPointB(pointB);
			triangle.setPointC(pointC);
		}
		shape.draw();
	}
}