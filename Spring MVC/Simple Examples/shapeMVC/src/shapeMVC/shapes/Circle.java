package shapeMVC.shapes;

import shapeMVC.shapes.points.Point;

public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
}
