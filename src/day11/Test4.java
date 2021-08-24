package day11;

import java.util.Scanner;

public class Test4 {
	
	
	public void show1() {
		
		
		Exception e=null;
		
		Scanner sc=new Scanner(System.in);
		
		String info=sc.nextLine();
		
		
		if(info.equals("1")) {
			e=new Exception("异常1");
		}else if(info.equals("2")){
			e=new Exception("异常2");
		}
		
		
		try {
			//自动抛出的
			//System.out.println(1/0);
			
			//手动的抛出异常
			if(e!=null) {
			throw e;
			}
			System.out.println("show1");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
	
	
	public void show2() throws Exception{
		
	/*	try {
		System.out.println(1/0);
		}catch (Exception e) {
			System.out.println("在内部就处理异常了");
		}*/
		
		//System.out.println(1/0);
		if(true) {
			throw new Exception("手动抛出show2中的错误");
		}

		System.out.println("show2结束");
		
	}

	public static void main(String[] args) throws Exception{


		
		System.out.println("开始");
		
		
		Test4 t=new Test4();
		//t.show1();
		
		try {
		t.show2();
		}catch (Exception e) {
			System.out.println("调用show2的时候异常");
			System.out.println(e.getMessage());
		}
		
		
		t.show2();
		
		System.out.println("结束");
		

	}

}
