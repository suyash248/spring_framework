package codingToInterfaces;

import org.springframework.beans.factory.annotation.Autowired;

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
	public void setCenter(Point center) {
		this.center = center;
	}
}
