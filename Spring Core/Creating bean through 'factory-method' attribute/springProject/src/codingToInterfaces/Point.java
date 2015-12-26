package codingToInterfaces;

public class Point {
	private static Point point = null;
	
	public int x;
	public int y;
	
	private Point(){}
	
	public static Point getPointInstance(){
		if(point==null)
			point = new Point();
		point.x=1;
		point.y=2;
		return point;
	}
}
