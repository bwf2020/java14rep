package day11;

import java.util.Scanner;

public class Test1 {
	
	
	
	public Test1() {
		
		
		
		Test1 t=new Test1();
		
	}
	

	public static void main(String[] args) {

		
		try {
		
		Test1 t=new Test1();
		
		}catch (Throwable e) {
			System.out.println("实例化对象的时候发生错误");
		}
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {

		try {
			
		System.out.println(1);
		System.out.println(1/0);//自动抛出异常对象 子对象
		System.out.println(2);
		
		}catch (Exception e) {//被父类接受
			System.out.println(3);
			System.out.println("发生算术错误");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		String a=sc.nextLine();
		
		if(a.equals("bye")) {
			
			break;
		}
		
		}
		
		System.out.println("结束");
		

	}

}
