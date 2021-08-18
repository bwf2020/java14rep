package day8;

public class Test8 extends User{
	
	
	int a=1;
	static int b=2;
	
	
	static {
		
		int c=3;
		System.out.println("静态代码块"+c);

		
		
	}
	
	
	{
		
		int d=4;
		System.out.println("代码块3"+d);
		
	}

	
	{
		int e=5;
		System.out.println("代码块1"+e);
		
	}
	
	
	public Test8() {
		
		int f=6;
		System.out.println("无参数的构造函数"+f);
	}
	
	public Test8(String name) {
		
		System.out.println("带参数的构造函数");
	}
	
	{
		
		System.out.println("代码块2");
		
	}

	public static void main(String[] args) {


		System.out.println("调用了主函数");
		
		/*Test8 t=new Test8();
		Test8 t2=new Test8();*/
		
		//Test8 t3=new Test8("bwf");
		
		Test8 t=new Test8();
		System.out.println(t);
		

	}

}
