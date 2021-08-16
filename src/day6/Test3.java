package day6;

public class Test3 {
	
	
	public int i=0;

	public  void m1(int a) {
		
		System.out.println("test3传递过来的值："+a);
		
		a++;
		
		System.out.println("test3修改之后的值："+a);
	}
	
	public  void m1(Test3 t) {
		
		System.out.println("test3传递过来的值："+t.i);
		
		t.i++;
		
		System.out.println("test3修改之后的值："+t.i);
	}
	
	public  void m1(Integer t) {
		
		System.out.println("test3传递过来的值："+t);
		
		t++;
		//t=new Integer(t.intValue()+1);
		
		System.out.println("test3修改之后的值："+t);
	}

	public static void main(String[] args) {


		Dog d1=new Dog(1, "小花");
		
		
		System.out.println(d1.id);
		System.out.println(d1.name);
		
		System.out.println(d1);
		
		System.out.println();
		
		int a=100;
		d1.m1(a);;
		System.out.println("原来的值："+a);
		
		
		
		Test3 t1=new Test3();
		
		t1.m1(a);
		System.out.println("原来的值："+a);
		
		System.out.println("=================");
		
		
		Test3 t2=new Test3();
		t2.i=100;
		
		t2.m1(t2);
		System.out.println("原来的值："+t2.i);
		
		System.out.println("=================");
		
		Integer i=new Integer(1);
		t2.m1(i);
		System.out.println("原来的值："+i);
		
		System.out.println("=================");
		
		Integer i1=new Integer(1);
		
		Integer i2=i1++;
		
		System.out.println(i1);
		System.out.println(i2);
		
		int a2=new Integer(100);
		System.out.println(a2);
		
		Integer a3=100;
		System.out.println(a3);
		
		Integer a4=new Integer(126);
		
		Integer a5=new Integer(126);
		
		System.out.println(a4==a5);
		
		Integer a6=-129;
		Integer a7=-129;
		
		System.out.println(a6==a7);
		
		System.out.println("=================");
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		
		
		System.out.println(Integer.compare(98, 100));
		
		System.out.println(Integer.toBinaryString(51));
		System.out.println(Integer.toHexString(51));
		System.out.println(Integer.toOctalString(51));
		
		System.out.println(Integer.toString(3, 2));
		System.out.println(Integer.toString(3, 3));
		System.out.println(Integer.toString(10, 10));
		
		
		
	}

}

