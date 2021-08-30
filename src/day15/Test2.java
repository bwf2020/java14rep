package day15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {

		
		Goods2 g1=new Goods2(1, "BH00b", "鞋子");
		Goods2 g2=new Goods2(2, "BH00a", "手套");
		Goods2 g3=new Goods2(3, "BH00c", "空调");
		
		
		Set set=new TreeSet(new Comparator<Goods2>() {

			@Override
			public int compare(Goods2 o1, Goods2 o2) {

				//return o1.getId()-o2.getId();
				
				return o1.getIsbn().compareTo(o2.getIsbn());
			}
			
			
		});
		
		set.add(g3);
		set.add(g2);
		set.add(g1);
		
		
		
		System.out.println(set);
		
		System.out.println("=============");
		
		
		Integer[] array= {1,5,3,6,2,4};
		
		Arrays.sort(array,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
			
		});
		
		System.out.println(Arrays.toString(array));
		

	}

}
