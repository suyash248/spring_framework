package inheritingBeanDef;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void myInit(){
		System.out.println("*****Point bean is initialized*****\n");
	}
	public void myDestroy(){
		System.out.println("\n*****Point Triangle bean is destroyed*****");	
	}
}
