package day9;

public class Test2 extends A {
	
	
	public void show() {
		
		
		
		System.out.println(this.b);
		System.out.println(this.d);
		System.out.println(this.c);
		System.out.println(A.c);
		System.out.println(Test2.c);
	
	
		
	}
	
	public static void main(String[] args) {
		
		
		Test2 t=new Test2();
		System.out.println(t.b);
		System.out.println(t.d);
		System.out.println(t.c);
		
		System.out.println(A.c);
		System.out.println(Test2.c);
		
		t.show();
		
	}

}
