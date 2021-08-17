package day7;

public abstract class Shape {

	
	public int width;
	public int height;
	public int rad;
	
	
	public void setSize(int w,int h,int r) {
		
		this.width=w;
		this.height=h;
		this.rad=r;
		
	}
	
	public abstract double getArea();

	
}
