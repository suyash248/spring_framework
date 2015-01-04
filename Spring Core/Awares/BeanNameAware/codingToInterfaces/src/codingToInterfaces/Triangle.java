package codingToInterfaces;

import org.springframework.beans.factory.BeanNameAware;

public class Triangle implements Shape, BeanNameAware {

		private Point pointA;
		private Point pointB;
		private Point pointC;
		private String beanName;
		
		@Override
		public void setBeanName(String beanName) {
			this.beanName=beanName;
			System.out.println("BeanContextAware.............");
		}
		
		public void draw(){
			System.out.println("Drawing Triangle from bean : "+beanName);
			System.out.println("PointA : "+"("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("PointB : "+"("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("PointC : "+"("+getPointC().getX()+", "+getPointC().getY()+")");
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
}
