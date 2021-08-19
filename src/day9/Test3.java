package day9;

public class Test3 {

	
	
	public void show(B b) {
		
		
		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getSex());
		
	}
	
	
	public static void main(String[] args) {
		
		
		Test3 t=new Test3();
		
		B b=new B();
		b.setId(1);
		b.setName("bwf");
		b.setSex('男');
		b.setA(1);
		
		
		t.show(b);
		
	}
	
	
	
}
