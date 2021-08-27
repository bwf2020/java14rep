package day14;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test7 {

	public static void main(String[] args) {


		LinkedList list=new LinkedList();
		
		list.add("zhangsan");
		
		list.add(0, "lisi");
		
		list.addFirst("wangwu");
		
		list.addLast("zhaoliu");

		
		list.push("bwf");
		
		System.out.println(list);
		
		list.pop();
		
		System.out.println(list);
		
		

	}

}
