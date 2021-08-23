package day10;

public class Outer {

	
	//成员变量
	private int a=1;
	int b=2;
	protected int c=3;
	public int d=4;
	public static int e=5;
	
	//成员内部类
	public class Inner{
		
		private int a=11;
		int b=22;
		protected int c=33;
		public int d=44;
		//public static int e=55;
		
		public void show2() {
			
			//访问外部的
			Outer outer=new  Outer();
			System.out.println(outer.a);
			System.out.println(outer.b);
			System.out.println(outer.c);
			System.out.println(outer.d);
			System.out.println(outer.e);
		}
		
	}
	
	//静态内部类
	public static class Inner2{
		
		
		private int a=111;
		int b=222;
		protected int c=333;
		public int d=444;
		public static int e=555;
		
		public void show1() {
			
			
			Outer outer=new Outer();
			System.out.println(outer.a);
			System.out.println(outer.b);
			System.out.println(outer.c);
			System.out.println(outer.d);
			System.out.println(outer.e);
			System.out.println(Outer.e);
			
		}
		
	}
	
	public void show1() {
		
		
		//访问内部的
		Inner i=new Inner();
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(i.c);
		System.out.println(i.d);

	
		i.show2();
		
		System.out.println("=========");
		Inner2 i2=new Inner2();
		System.out.println(i2.a);
		System.out.println(i2.b);
		System.out.println(i2.c);
		System.out.println(i2.d);
		System.out.println(i2.e);
		
		System.out.println(Inner2.e);
	
		i.show2();
		
		
	}
	
	
	
	
	
}
