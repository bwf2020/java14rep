package day8;

public class Test3 {

	
	int a;
	static int b;
	
	
	public void show1() {
		
		System.out.println("show1");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void show2() {
		
		System.out.println("show2");
		System.out.println(b);
		//System.out.println(a);
		
	}
	
	public static void main(String[] args) {


		Test3.b=100;
		
		System.out.println(Test3.b);
		
		Test3.show2();
		
		System.out.println("========");
		
		Test3 t3=new Test3();
		t3.a=200;
		
		System.out.println(t3.a);
		
		t3.show1();
		
		System.out.println(t3.b);
		t3.show2();
		
		

	}

}
