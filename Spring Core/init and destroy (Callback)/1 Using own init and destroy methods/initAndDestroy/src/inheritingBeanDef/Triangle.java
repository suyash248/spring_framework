package inheritingBeanDef;

public class Triangle {

		private Point pointA;
		private Point pointB;
		private Point pointC;
		
		public void myInit(){
			System.out.println("*****Triangle bean is initialized*****\n");
		}
		public void myDestroy(){
			System.out.println("\n*****Triangle bean is destroyed*****");	// The "destroy-method" is only called if and only if the bean is a singleton instance
		}
		
		public Point getPointA() {
			return pointA;
		}
		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}
		public Point getPointB() {
			return pointB;
		}
		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}
		public Point getPointC() {
			return pointC;
		}
		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}
		
		public void draw(){
			System.out.println("PointA : "+"("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("PointB : "+"("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("PointC : "+"("+getPointC().getX()+", "+getPointC().getY()+")");
		}
}
