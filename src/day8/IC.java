package day8;

public interface IC {

	
	public int a=1;
	
	public abstract void show1();
	
	public default void show2() {
		
		System.out.println("ic接口 show2");
		
	}
	
	public static void show3() {
		
		System.out.println("ic接口 show3");
		
	}
	
}
