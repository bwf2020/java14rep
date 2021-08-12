package day4;

public class Test5 {
	
	
	static int a2=200;
	static int b1;
	static float c1;
	static boolean f1;
	
	
	public static void main(String[] args) {
		
		
		
		int a1=100;
		int b2;
		
		System.out.println(a1);
		System.out.println(a2);
		
		//重新定义
		/*int a2=300;
		System.out.println(a2);*/
		
		//int a1=400;
		
		//调用show1
		
		show1();
		
		//修改
		a2=400;
		System.out.println(a2);
		show1();
		
		{
			
			int i=10;
			System.out.println(i);
			System.out.println(a2);
			System.out.println(a1);
			//System.out.println(b2);
			
		}
		
		//System.out.println(i);
		
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(f1);
		
		//System.out.println(b2);
		show1();
		
	}
	

	public static void show1() {
		
		
		//System.out.println(a1);
		System.out.println("show1方法被调用了");
		System.out.println(a2);
		System.out.println(b1);
		
	}
	
}
