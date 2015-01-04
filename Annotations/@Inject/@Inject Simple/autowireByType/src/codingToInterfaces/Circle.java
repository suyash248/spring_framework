package codingToInterfaces;

import javax.inject.Inject;


public class Circle implements Shape {
	
	@Inject
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
