package day16;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Test1<T> {
	
	
	 
	 public String show3(T s) {
		 
		 return "bwf";
	 }
	 
	 public T show4(T s) {
		 
		 return s;
	 }
	 
	 public Object show5(Object o) {
		 
		 return o;
	 }
	 
	 

	public static void main(String[] args) throws  Exception {


		Properties pro=new Properties();
		
		InputStream in=Test1.class.getResourceAsStream("my.properties");
		pro.load(in);
		
		//自己额外设定
		pro.setProperty("age", "55");
		
		
		//获取文件中的key=value和自己设定的key-value
		
		System.out.println(pro.get("id"));
		
		System.out.println(pro.getProperty("name"));
		
		System.out.println(pro.get("sex"));
		
		System.out.println(pro.getProperty("age"));
		
		System.out.println("============");
		
		List<String> list=new ArrayList<String>();
		
		list.add("zhangsan");
		list.add("lisi");
		list.add(new String("wangwu"));
		
		
		//面试官 Integer包装类
		List<Integer> list2=new ArrayList<Integer>();
		
		list2.add(100);
		list2.add(new Integer(200));
		
		System.out.println("======================");
		Test1<Integer> t1=new Test1<Integer>();
	
		
		t1.show3(100);
		
		t1.show4(200);

		System.out.println("==================");
		
		Test2 t2=new Test2();
		
		User u= t2.show1(new User());
		
		String name= t2.show1("bwf");
		
		int num=t2.show1(100);
		
		
		int num2=(int) t2.show2(100);
		
		String name2=(String) t2.show2("bwf");
		
		User u2=(User) t2.show2(new User());
		
		
		System.out.println("=============");
		
		Test1<User> t3=new Test1<User>();
		User u3= t3.show4(new User());
		
		User u4= (User) t3.show5(new User());
		
	
		
		
		

	}

}
