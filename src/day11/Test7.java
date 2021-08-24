package day11;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {


		
		Scanner sc=new Scanner(System.in);
		String info;
		while(!(info=sc.nextLine()).equals("bye")) {
			
			
			System.out.println(info);
			if(info.equals("1")) {
				
				MyException1 e1=new MyException1("自己业务异常1");
				
				try {
				 throw e1;
				}catch (Exception e) {
					System.out.println(e);
				}
				
			}else if(info.equals("2")){
				
				MyException2 e2=new MyException2();
				
				try {
				 throw e2;
				}catch (Exception e) {
					System.out.println(e);
				}
				
			}
			
		}
		
		System.out.println("结束");
		
		

	}

}
