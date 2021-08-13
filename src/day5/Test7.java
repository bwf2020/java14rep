package day5;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		System.out.println("======欢迎======");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.登陆\t2.退出");
		
		String flag=sc.nextLine();
		
		switch (flag) {
		case "1":
			System.out.println("进入登陆界面");
			break;
		case "2":
			System.out.println("===再见==");
			System.exit(0);
			break;
		default:
			break;
		}
				

	}

}
