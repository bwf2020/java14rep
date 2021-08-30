package day15;

import java.util.Set;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {

		
		Goods g1=new Goods(1, "BH00b", "鞋子");
		Goods g2=new Goods(2, "BH00a", "手套");
		Goods g3=new Goods(3, "BH00c", "空调");
		
		
		Set set=new TreeSet();
		
		set.add(g3);
		set.add(g2);
		set.add(g1);
		
		
		
		System.out.println(set);
		
		System.out.println("=============");
		
		System.out.println("aba".compareTo("acb"));
		
		

	}

}
