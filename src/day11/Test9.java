package day11;

import java.text.DecimalFormat;
import java.util.Random;

public class Test9 {

	public static void main(String[] args) {


		Integer i=100;
		Integer j=100;
		
		System.out.println(i==j);
		
		
		Integer i2=128;
		Integer j2=128;
		
		System.out.println(i2==j2);
		
		
		Integer i3=new Integer(100);
		Integer j3=new Integer(100);;
		
		System.out.println(i3==j3);
		
		String s1="b";
		String s2=new String("bwf");
		String s3="wf";
		String s4=s1+s3;
		
		System.out.println("==============");

		
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.ceil(3.000000000001));
		
		System.out.println(Math.floor(3.9999999999999999999999999999));
		
		
		float a=3.45F;
		
		System.out.println(Math.round(a));
		
		System.out.println("======");

		for (int k = 0; k < 100; k++) {
			System.out.println((int)(Math.random()*91+10));
		}
		
		System.out.println("======");

		for (int k = 0; k <100; k++) {

			System.out.println(10+new Random().nextInt(100-10+1));
		}
		
		
		System.out.println("======");
		
		for (int k = 0; k <100; k++) {
		System.out.println(10+new Random().nextInt(91));
		}
		
	}

}
