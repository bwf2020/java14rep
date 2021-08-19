package day9;

public class Test5 extends D {

	
	public int a=2;
	
	
	@Override
	public void show1() {
		System.out.println("test5 show1");
	}
	
	

	public static void main(String[] args) {


		
		Test5 t=new Test5();
		
		System.out.println(t.a);
		t.show1();
		
		System.out.println(t);
		
		D t2=t;
		System.out.println(t2);
		System.out.println(t2.a);
		t2.show1();//按理调用父类 但是调用子类
		
		//向下转型 编译是可以的 但不能代表运行可以
		
		D d=new D();
		
		//Test5 t3=(Test5)d;//不合适的
		
		//t.show2(d);
		
		t.show2(t);
		
		
		
	}
	
	public void show2(D d) {
		
		Test5 t=(Test5) d;
		
		
	}

}
