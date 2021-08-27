package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {


		
		//Collection  c=new ArrayList();
		
		List c=new ArrayList();
		
		
		System.out.println(c);
		
		System.out.println(c.isEmpty());
		
		System.out.println(c.size());
		
		c.add(100);
		
		c.add(true);
		
		c.add('a');
		
		c.add("bwf");
		
		User u=new User();
		c.add(u);
		
		c.add(1, "zhangsan");
		c.add(0, "lisi");
		
		System.out.println(c.size());
		System.out.println(c);
		
		/*c.clear();
		System.out.println(c);*/
		
		System.out.println(c.contains("bwf2"));
		
	/*	c.remove("bwf");
		c.remove(u);
		
		
		System.out.println(c);
		*/
		
		c.add(100);
		System.out.println(c);
		
		Object[] array= c.toArray();
		
		System.out.println(array.length);
		
		for (Object obj : array) {
			System.out.println(obj);
		}
		
		System.out.println("===========");
		
		System.out.println(c.get(0));
		
		for (int i = 0; i < c.size(); i++) {
			Object obj = c.get(i);
			
			System.out.println(obj);
			
		}
		
		System.out.println("===========");
		
		for (Object obj : c) {
			System.out.println(obj);
		}
		
		System.out.println("===========");
		
		List list1=new ArrayList();
		System.out.println(list1);
		
		for (int i = 0; i < 30; i++) {
			
			list1.add(i);
			
		}
		System.out.println(list1);
		
		System.out.println(c);
		
		c.set(3, "wangwu");
		
		
		c.add(300);
		
		System.out.println(c);
		
		//c.remove(new Integer(300));
		c.remove(7);
		
		System.out.println(c);
	}

}
