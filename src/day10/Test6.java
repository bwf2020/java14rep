package day10;

import java.util.Scanner;

public class Test6 {

	
	
	public Test6() {
		
		System.out.println("循环调用构造函数了");
		
		Test6 t=new Test6();
		
		
	}
	
	public static void main(String[] args) {
		
		
		try {
		
		Test6 t=new Test6();
		}catch (Exception e) {
			System.out.println("发生错误了");
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("请输入一个数字");
			
			String num =sc.nextLine();
			
			try {
				System.out.println("结果为:"+(Integer.parseInt(num)+1));
			}catch (Exception e) {
				System.out.println("请输入正确的数字");
			}
			
			
			/*boolean flag=true;

			for (int i = 0; i < num.length(); i++) {
				
				char c=num.charAt(i);
				
				if(c<48||c>57) {
					
					flag=false;
					break;
				}
			}
			
			
			if(flag) {
				System.out.println("结果为:"+(Integer.parseInt(num)+1));
			}else {
				System.out.println("请输入数字");
			}*/
			
			
			
			
		}
		
		
	}
}
