package day31;

public class Child extends Base {

	
	public Child() {
		
		System.out.println("无参的构造函数");
	}
	
	public Child(String a) {
		
		
		System.out.println("带有一个参数的构造函数"+a);
		
	}
	public Child(String a,int b) {
		
		
		System.out.println("带有两个参数的构造函数"+a+b);
		
	}
	
	private Child(int a) {
		
		System.out.println("私有的构造函数"+a);
	}
	
	private int c;
	
	public String d;
	
	private void  show3() {
		
		System.out.println("child show3");
		
	}
	
	public String show4() {
		
		System.out.println("child show4");
		return "51testing";
	}
	
	public String show4(int a) {
		
		System.out.println("child show4 2重载了  int"+a);
		return "51testing";
	}
	
	public String show4(Integer a) {
		
		System.out.println("child show4 2重载了 Integer"+a);
		return "51testing";
	}
	
	public String show4(int a,String b) {
		
		System.out.println("child show4 3重载了 int String"+a+b);
		return "51testing";
	}
	
	
}
