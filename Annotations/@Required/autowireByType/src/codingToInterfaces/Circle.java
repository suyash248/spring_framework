package codingToInterfaces;

import org.springframework.beans.factory.annotation.Required;

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
	@Required		// If this setter is not executed, Then an exception will be thrown at the tme of bean initialization.
	public void setCenter(Point center) {
		this.center = center;
	}
}
