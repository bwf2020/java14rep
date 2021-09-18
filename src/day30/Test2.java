package day30;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws  Exception {
		
		
		Class c1=User.class;
		//User u=new User();
		//User u=User.class.newInstance();
		
		Properties pro=new Properties();
		pro.load(Test2.class.getResourceAsStream("obj.properties"));
		
		
		User u=(User) Class.forName(pro.getProperty("user")).newInstance();
		
		System.out.println(u.name);
		System.out.println(u.age);
		//System.out.println(u.id);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入属性名字");
		String fieldName="age";
		
		Field f1=c1.getField(fieldName);
		
		System.out.println(f1.get(u));
		
		u.name="bwf";
		System.out.println(f1.get(u));
		
		f1.set(u, 20);
		System.out.println(u.name);
		System.out.println(u.age);
		
		System.out.println("=============");
		
		f1=c1.getDeclaredField("id");
		f1.setAccessible(true);
		f1.set(u, 100);
		
		System.out.println(f1.get(u));
		
		

	}

}
