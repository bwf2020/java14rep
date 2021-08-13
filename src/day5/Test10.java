package day5;

public class Test10 {

	public static void main(String[] args) {


		System.out.println("程序入口方法");
		
		//调用
		m1();
		
		m2(10);
		
		m3("bwf");
		
		m4(100,"bwf");
		
		m5(20,"a","b","bwg");
		
		m1(10);
		m1("bwf");
		m1(10,20);
		m1(10,"bwf");
		m1("bwf",10);
		
		
		System.out.println("============");
		
	/*	int a=m6();
		System.out.println(a);
		
		m7();
		m7();*/
		
		System.out.println("============");
		
		int a=10;
		
		System.out.println("调用之前的值:"+a);
		
		m8(a);
		
		System.out.println("调用之后的值:"+a);
		
		int[] a2= {1};
		System.out.println("调用之前的值:"+a2[0]);
		
		m8(a2);
		
		System.out.println("调用之后的值:"+a2[0]);

	}
	
	public static void m1() {
		
		System.out.println("方法1");
		System.out.println("方法中的实现");
	}
	
	
	public static void m1(int a) {
		
		System.out.println("方法1_1");

	}
	
	public static void m1(String a) {
		
		System.out.println("方法1_2");

	}
	
	public static void m1(int a,int b) {
		
		System.out.println("方法1_3");

	}
	
	public static void m1(int a,String b) {
			
			System.out.println("方法1_4");
	
		}
	
	public static void m1(String b,int a) {
		
		System.out.println("方法1_5");

	}
	
	public static void m2(int a) {
		
		System.out.println("方法2"+a);
	
	}
	
	public static void m3(String a) {
		
		System.out.println("方法3"+a);
	
	}

	
	public static void m4(int a,String b) {
		
		System.out.println("方法4"+a+b);
	
	}
	
	public static void m5(int a,String... b) {
		
		System.out.println("方法5"+a+b.length);
	}
	
	public static int m6() {
		
		return 100;
		
	}
	
	public static String m7() {
		
		System.out.println("方法7");
		return "bwf";
		
	}
	
	public static void m8(int a) {
		
		System.out.println("方法8");
		System.out.println("接受的参数："+a);
		
		a*=2;
		System.out.println("修改后的参数："+a);
		
	}
	
	public static void m8(int[] a) {
		
		System.out.println("方法8_1");
		System.out.println("接受的参数："+a[0]);
		
		a[0]=100;
		System.out.println("修改后的参数："+a[0]);
		
	}


}
