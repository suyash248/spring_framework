package codingToInterfaces;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Circle implements Shape {
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Center : ("+getCenter().x+", "+getCenter().y+")");
	}
}