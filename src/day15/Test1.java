package day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {


		Set set =new HashSet();
		
		set.add(1);
		set.add(true);
		set.add("bwf");
		
		User u1=new User();
		u1.name="zhangsan";
		
		
		User u2=new User();
		u2.name="zhangsan";
		
		set.add(u1);
		set.add(u2);
		
		
		set.add(1);
		set.add("bwf");
		
		
		
		System.out.println(set);
		
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u1.equals(u2));
		
		System.out.println("===========");
		
		
		set=new HashSet();
		set.add("zhangsan");
		set.add("lisi");
		set.add("wangwu");
		
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			
			String obj=(String) it.next();
			System.out.println(obj);
			
		}
		
		List list=new ArrayList();
		list.add("zhaoliu");
		list.add("bwf");
		list.add(true);//装箱机制，原则是对象
		
		for (Iterator it2 = list.iterator(); it2.hasNext();) {

			Object obj =   it2.next();
			
			if(obj instanceof String) {
				
				System.out.println(((String)obj).charAt(0));
				
			}else if(obj instanceof Boolean) {
				
				if((Boolean)obj) {
					System.out.println("对的");
				}
				
			}
			
			
			
		}
		
		System.out.println("=========");
		
		
		/*System.out.println(set);
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		set.remove("lisi");
		System.out.println(set);*/
		
		
	/*	for (int i = 0; i < list.size(); i++) {

			if(i==1) {
				list.remove(i);
			}
			
			
		}
		
		System.out.println(list);*/
		
		
		/*for (Object obj : list) {
			
			if(obj.equals("bwf")) {
				
				list.remove("bwf");
			}
			
		}
		
		System.out.println(list);*/
		
		/*for (Iterator it2 = list.iterator(); it2.hasNext();) {
			Object obj = (Object) it2.next();
			if(obj.equals("bwf")) {
				
				 //list.remove("bwf");
				it2.remove();
				
			}
			
		}
		
		System.out.println(list);*/
		
		
		System.out.println(set);
		
		Iterator it3=set.iterator();
		
		while(it3.hasNext()) {
			
			if(it3.next().equals("zhangsan")) {
				
				it3.remove();
				//set.remove("zhangsan");
			}
		}
		
		System.out.println(set);
		
		
	}

}
