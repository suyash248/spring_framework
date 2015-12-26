package codingToInterfaces;

public abstract class Triangle implements Shape {

		private Point pointA;
		private Point pointB;
		private Point pointC;
		
		public void draw(){
			System.out.println("Drawing Triangle");
			pointA=getPointA();
			System.out.println("PointA : "+"("+pointA.getX()+", "+pointA.getY()+")");
			pointB=getPointB();
			System.out.println("PointB : "+"("+pointB.getX()+", "+pointB.getY()+")");
			pointC=getPointC();
			System.out.println("PointC : "+"("+pointC.getX()+", "+pointC.getY()+")");
		}
		public abstract Point getPointA();
		public abstract Point getPointB();
		public abstract Point getPointC();
}
