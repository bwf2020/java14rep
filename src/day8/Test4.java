package day8;

public class Test4 {

	
	int a;
	static int b;
	
	public static void main(String[] args) {

		
		System.out.println(b);
		//System.out.println(a);
		//System.out.println(this);
		
		Test4 t0;
		
		

		Test4 t1=new Test4();
		
		Test4 t2=new Test4();
		
		t1.a=100;
		
		System.out.println(t1.a);
		System.out.println(t2.a);
		
		t2.a=200;
		
		System.out.println(t1.a);
		System.out.println(t2.a);
		
		t1.b=100;
		System.out.println(t1.b);
		System.out.println(t2.b);
		t2.b=200;
		
		System.out.println(t1.b);
		System.out.println(t2.b);
		
		Test4.b=300;
		System.out.println(t1.b);
		System.out.println(t2.b);
		
		
	}

}
