package day10;

import static day9.User22.*;

import java.util.Scanner;

import day9.User22;

public class Test5 {

	
	
	
	public static void show(Object o) {
		
		
		if(o instanceof User) {
			
			System.out.println("是用户1");
		}else if(o instanceof User2) {
			
			System.out.println("是用户2");
		}else if(o instanceof Person) {
			
			System.out.println("是人类");
		}else {
			
			System.out.println("是用户");
		}
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		User u=new User();
		
		System.out.println(u instanceof Object);
		
		System.out.println(u instanceof User);
		
		//System.out.println(u instanceof User2);
		
		
		System.out.println(u instanceof IA);
		
		System.out.println(u instanceof Person);
		
		if(u instanceof Person) {
			
			System.out.println("是人类");
		}else if(u instanceof User) {
			
			System.out.println("是用户1");
		}else {
			
			System.out.println("是Object");
		}
		
		System.out.println("============");
		
		
		show(u);
		
		User2 u2=new User2();
		
		show(u2);
		
		
		System.out.println("============");
		
		User u3=new User();
		u3.show1();
		u3.show2();
		
		Person p3=u3;
		p3.show1();
		p3.show2();
		
		System.out.println("============");
		
		/*User22 u22=new User22();
		u22.show1();
		u22.show2();*/
		
		show2();
		
		System.out.println("============");
		
		u3=null;
		
		System.out.println("============");
		System.out.println(u3);
		
		System.runFinalizersOnExit(true);
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("清理:"+i);
			System.gc();
			
			if(i==10) {
				
				System.exit(0);
			}
			
			Thread.sleep(1000);
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		sc.nextLine();

	

		
		
	}
}
