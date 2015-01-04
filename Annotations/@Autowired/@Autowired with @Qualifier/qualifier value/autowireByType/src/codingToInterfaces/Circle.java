package codingToInterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Center : ("+getCenter().getX()+", "+getCenter().getY()+")");
	}

	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")	// It will look for a bean having either bean id=circleRelated or qualifier value=circleRelated
	public void setCenter(Point center) {
		this.center = center;
	}
}
