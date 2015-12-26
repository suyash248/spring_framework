package codingToInterfaces;

public class Circle implements Shape {

	private Point center;		
	
	public Circle(Point center){ // RESTRICTION :  there should be ONLY ONE parameter of one type in constructor in case of autowire="constructor".
		this.center=center;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Center : ("+center.getX()+", "+center.getY()+")");
	}
}
