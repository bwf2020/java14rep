package day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {


		System.out.println(1);
		
		if(true) {
		System.out.println(2);
		}
		
		if(!true) {
		System.out.println(3);
		}
		
		System.out.println(4);
		
		if(true) {
			System.out.println(5);
		}
		
		
		if(1<2&&2<3) {
			
			System.out.println(6);
		}
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入一个数字");
		
		String num=sc.nextLine();
		
		int num1=Integer.parseInt(num);
		
		/*if(Integer.parseInt(num)>0) {
			
			System.out.println("是正数");
		}else {
			System.out.println("是负数");
		}*/
		
		if(num1==1) {
			
			System.out.println("一");
		}else if(num1==2) {
			
			System.out.println("二");
		}else if(num1==3) {
			
			System.out.println("三");
		}else {
			
			if(num1<=100) {
				System.out.println("小于等于100");
			}else {
				System.out.println("大于100");
			}
			
		}
		
		

	}

}
