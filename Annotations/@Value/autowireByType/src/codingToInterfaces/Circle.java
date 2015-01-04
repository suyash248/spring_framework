package codingToInterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	
	@Autowired
	@Qualifier("pointB")	// It will look for a bean having either id=pointB or qualifier value=pointB
	private Point center;
	
	@Value("4")	// Can use static values
	private int radius;
	
	@Value("#{T(java.lang.Math).PI*circle.radius*circle.radius}")	// Can use spEL
	private double area;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle with radius="+getRadius()+" & area="+getArea());
		System.out.println("Center : ("+getCenter().getX()+", "+getCenter().getY()+")");
	}

	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
