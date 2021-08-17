package day7;

public final class Test7 {
	
	final int a=0;
	int c;
	
	public static void show1() {
		
		System.out.println("show1");
	}
	
	public final static void show2() {
		
		System.out.println("show2");
		
	}

	public static void main(String[] args) {


		final int b;
		
		final Test7 t=new Test7();
		
		t.c=20;
		t.c=21;
		t.c=22;
		
		show1();
		show2();
		
		
	}

}
