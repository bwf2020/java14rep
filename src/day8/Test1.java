package day8;

public class Test1{

	public static void main(String[] args) {


		
		//A a=new A();
		IA a=new A();
		
		System.out.println(a.num);
		
		System.out.println(IA.num);
		
		a.show1();
		//a.show2();
		
		Object a2=new A();
		
		System.out.println(a);
		System.out.println(a2);
		
		Object a3=new Object();
		System.out.println(a3);
		
		/*A a4=(A) a3;
		
		System.out.println(a4);*/
		
		/*A a5=new A();
		B b5=(B)a5;*/
		
		System.out.println("===========");
		
		A a10=new A();
		A2 a20=new A2();
		B b30=new B();
		
		/*show1(a10);
		show1(a20);
		show1(b30);*/
		
		show(a10);
		show(a20);
		
		show2(a10);
		show2(a20);
		show2(b30);
		
	}
	
	public static void show(IA a) {
		
		a.show1();
		
	}
	
	public static void show2(Object o) {
		
		System.out.println("调用了"+o);
		
		if(o instanceof A) {
			
			A a1=(A) o;
			a1.show1();
		}
		if(o instanceof A2) {
			
			A2 a1=(A2) o;
			a1.show1();
		}
		if(o instanceof B) {
			
			B a1=(B) o;
			a1.show1();
		}
		
		
	}
	
	/*public static void show1(A a) {
		
		a.show1();
		
	}
	
	public static void show1(A2 a) {
			
			a.show1();
			
		}
	
	public static void show1(B b) {
		
		b.show1();
		
	}*/
		

}
