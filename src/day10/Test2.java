package day10;

import day10.Outer.Inner;
import day10.Outer.Inner2;

public class Test2 {

	public static void main(String[] args) {


		Outer outer=new Outer();
		outer.show1();
		
		System.out.println("在外部实例化非静态的内部类");
		
		//通过外部对象去new 一个内部对象
		Inner inner=outer.new Inner();
		System.out.println(inner.b);
		//通过某种手段能访问类中的私有资源了
		inner.show2();
		
		
		System.out.println("在外部实例化静态的内部类");
		
		
		Inner2 inner2=new Outer.Inner2();
		inner2.show1();
		
		
		System.out.println(Outer.Inner2.e);
		

	}

}
