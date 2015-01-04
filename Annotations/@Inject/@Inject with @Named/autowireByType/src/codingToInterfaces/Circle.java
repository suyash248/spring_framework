package codingToInterfaces;

import javax.inject.Inject;
import javax.inject.Named;


public class Circle implements Shape {
	
	@Inject
	@Named(value="pointB")
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Center : ("+getCenter().getX()+", "+getCenter().getY()+")");
	}

	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
}
