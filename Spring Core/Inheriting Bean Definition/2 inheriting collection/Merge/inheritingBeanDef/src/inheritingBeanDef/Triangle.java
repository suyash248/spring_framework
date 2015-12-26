package inheritingBeanDef;

import java.util.Iterator;
import java.util.List;

public class Triangle {

		private List<Point> points;
		
		public void draw(){
			Iterator<Point> itr=points.iterator();
			while(itr.hasNext()){
				Point point=itr.next();
				System.out.println("Point : "+"("+point.getX()+", "+point.getY()+")");
			}
		}

		public List<Point> getPoints() {
			return points;
		}

		public void setPoints(List<Point> points) {
			this.points = points;
		}
}
