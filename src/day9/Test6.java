package day9;

public class Test6 {
	
	
	public void show(D d) {
		
		System.out.println("测试中的show");
		
		//同一个d对象中的同一个方法，但是有不同的表现
		d.show1();
		
	}

	public static void main(String[] args) {


		Test6 t=new Test6();
		
		D d=new D();
			
		t.show(d);
		
		D1 d1=new D1();
		
		t.show(d1);
		
		D2 d2=new D2();
		
		t.show(d2);

	}

}
