package codingToInterfaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
	
	@PostConstruct		// This method will be invoked after initializing/constructing the bean.
	public void initCircle(){
		System.out.println("Circle init");
	}
	
	@PreDestroy		// This method will be invoked just before destroying the bean.
	public void destroyCircle(){
		System.out.println("Circle destroy");
	}
}
