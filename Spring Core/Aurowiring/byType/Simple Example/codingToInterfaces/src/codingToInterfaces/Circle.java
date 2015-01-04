package codingToInterfaces;

public class Circle implements Shape {

	private Point center;		// RESTRICTION :  there should be ONLY ONE bean of the type codingToInterfaces.Point in case of autowire="byType"
	
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
