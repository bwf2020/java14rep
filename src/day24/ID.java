package day24;

@FunctionalInterface
public interface ID {

	
	public int z=0;
	
	public void m1();
	
	public static void m2() {
		
		System.out.println("m2");
		
	};
	
	public static void m3(int a) {
		
		System.out.println("m3");
		
	};
	
	public static void m4(int a,int b) {
		
		System.out.println("m4");
		
	};
	
	public static  int m5(int a,int b) {
		
		System.out.println("m5");
		return b-a;
		
	};
	

	
	
	
	
}
