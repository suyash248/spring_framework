package codingToInterfaces;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, ApplicationContextAware {

		private Point pointA;
		private Point pointB;
		private Point pointC;
		private ApplicationContext context;
		@Override
		public void setApplicationContext(ApplicationContext context) throws BeansException {
			System.out.println("setApplicationContext method is invoked.");
			this.context=context;
		}
		
		public void draw(){
			System.out.println("Drawing Triangle");
			System.out.println("PointA : "+"("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("PointB : "+"("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("PointC : "+"("+getPointC().getX()+", "+getPointC().getY()+")");
			
			/*System.out.println(context.getBean("pointA"));
			System.out.println(context.getBean("pointA"));
			System.out.println(context.getBean("pointA"));*/
			
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
