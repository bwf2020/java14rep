package day6;

public class Dog {

	
	public int id=100;
	public String name="旺财";
	
	public int a;
	public int b;
	public int c;
	
	public  Dog() {
		
		id=200;
		name="旺旺";
		System.out.println("构造函数");
		
	}
	
	public  Dog(int bh) {
		
		id=bh;
	
		System.out.println("带编号的构造函数");
		System.out.println("编号:"+bh);
		
	}
	
	public Dog(int id,String name) {
		
		this.id=id;
		this.name=name;
		
		System.out.println("编号："+id+"名字："+name+"当前对象："+this);
		
		
	}
	
	
	public void m1(int a) {
		
		System.out.println("传递过来的值："+a);
		
		a++;
		
		System.out.println("修改之后的值："+a);
	}
	
	
	public Dog(int a,int b) {
		
		this.a=a+1-2*3/5;
		this.b=b+(3-5)*3%2;
		
		
	}
	public Dog(int a,int b,int c) {
			
		
		this(a,b);
		this.c=c*3-2+100;
			
	}
	
	
	public void m2(int a) {
		
		this.m1(a);
		System.out.println("方法2");
	}
	
}
