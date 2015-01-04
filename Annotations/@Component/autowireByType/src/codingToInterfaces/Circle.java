package codingToInterfaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
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
	@Resource(name="pointA")
	public void setCenter(Point center) {
		this.center = center;
	}
}
