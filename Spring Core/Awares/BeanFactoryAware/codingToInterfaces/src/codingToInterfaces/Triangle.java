package codingToInterfaces;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Triangle implements Shape, BeanFactoryAware {

		private Point pointA;
		private Point pointB;
		private Point pointC;
		private BeanFactory beanFactory;
		
		@Override
		public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
			this.beanFactory=beanFactory;
			System.out.println("BeanFactoryAware..........");
		}
		
		public void draw(){
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
