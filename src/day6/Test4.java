package day6;

public class Test4 {

	public static void main(String[] args) {


		Dog d1=new Dog();
		System.out.println(d1);
		
		d1.m1(100);
		
		System.out.println("");
		
		Dog d2=new Dog(10, 20,30);
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d2.c);
		
		d2.m2(10);
		

	}

}
