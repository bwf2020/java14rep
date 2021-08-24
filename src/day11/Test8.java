package day11;

import java.util.Scanner;

public class Test8 {

	
	
	public static void main(String[] args) {
		
		
		//admin  123
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入账号");
		
		String account=sc.nextLine();
		
		

		System.out.println("请输入密码");
		
		String pwd=sc.nextLine();
		
		//以前通过判断语句
		
		/*if(account.equals("admin")&&pwd.equals("123")) {
			
			System.out.println("欢迎进入系统");
		}else {
			
			System.out.println("账号和密码不一致");
		}*/
		
		
		try {
			
			if(account.equals("admin")&&pwd.equals("123")) {
				
				System.out.println("欢迎进入系统");
				
			}else {
				
				throw new LoginException();
			
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("==结束==");
		
	}
	
	
}
