package day4;

public class Test7 {

	public static void main(String[] args) {


		int Test7=100;
		
		System.out.println(Test7);
		
		int b=100;
		
		System.out.println(a.Test2.name);
		
		
		byte a1=127;
		int a2=a1;
		
		System.out.println(a2);
		long a3=a2;
		
		System.out.println(a3);
		
		float a4=a3;
		System.out.println(a4);
		
		byte b1=127;
		int b2=128;
		
		b1=(byte)b2;
		System.out.println(b1);
		
		float b3=3.14f;
		b1=(byte) b3;
		
		System.out.println(b1);
		
		System.out.println(5/2);
		
		System.out.println(5f/2f);
		
		
		boolean f1=true;
		
		//b2=(int)f1;
		
		String s1="100";
		
		System.out.println(s1);
		
		s1=String.valueOf(b2);
		
		System.out.println(s1);
	
		
		s1=String.valueOf(b3);
		System.out.println(s1);
		
		
		s1="100";
		System.out.println(b2);
		b2=Integer.parseInt(s1);
		System.out.println(b2);
		
		
		System.out.println(b3);
		b3=Float.parseFloat(s1);
		System.out.println(b3);
		
		System.out.println(5.0/2);
		
		System.out.println(1+2);
		System.out.println("1"+2);
		System.out.println('1'+2);
		
		
		System.out.println(3&2);
		System.out.println(3|2);
		System.out.println(3^2);
		System.out.println(3>>2);
		System.out.println(3<<2);
		
		System.out.println(true&false);
		System.out.println(true&&false);
		
		
		int i=0;
		
		/*System.out.println(false&(i++==0));
		System.out.println(i);*/
		
		System.out.println(false&&(i++==0));
		System.out.println(i);
		
		
		int a6=false?1:0;
		System.out.println(a6);
		
		System.out.println("=============");

		
		int num1=10;
		int num2=20;
		
		System.out.println("num1:"+num1);
		
		System.out.println("num2:"+num2);
		
		/*int temp=num1;
		num1=num2;
		num2=temp;*/
		
	/*	num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;*/
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		
		
		
		System.out.println("num1:"+num1);
		
		System.out.println("num2:"+num2);
		
		
		
		
	}

}
