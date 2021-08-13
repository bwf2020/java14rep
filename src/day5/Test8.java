package day5;

import java.util.Scanner;

public class Test8 {

	
	public static void main(String[] args) {
		
		int i=5;
		while(i<5) {
			System.out.println("先判断");
			System.out.println(i++);
			
		}
		
		
		int j=5;
		
		do {
			System.out.println("先执行");
			System.out.println(j++);
			
		}while(j<5);
		
		
		System.out.println("=====================");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("输入名字");
		String name=sc.nextLine();
		
		while(!name.equals("bye")) {
			
			System.out.println("名字:"+name);
			System.out.println("输入名字");
			name=sc.nextLine();
		}
		System.out.println("结束");
		
		
	}
	
}
