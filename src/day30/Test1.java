package day30;

import java.lang.reflect.Field;

public class Test1 {

	public static void main(String[] args) throws Exception {


		Class u1= User.class;
		
		System.out.println(u1);
		
		User u=new User();
		
		Class u2=u.getClass();
		
		System.out.println(u2);
		
		System.out.println(u1==u2);
		
		Class u3= Class.forName("day30.User");
		
		System.out.println(u3);
		
		System.out.println(u1==u2);
		
		System.out.println(u2==u3);
		
		System.out.println("=================");
		
		
		//Field[] fields=u1.getFields();//公开的属性
		
		Field[] fields=u1.getDeclaredFields();
		
		System.out.println(fields.length);
		
		for (Field field : fields) {
			System.out.println(field.getName());
			System.out.println(field.getModifiers());
			System.out.println(field.getType().getName());
		}
		
		System.out.println("=================");
		
		Field f1= u1.getField("name");
		System.out.println(f1);
		System.out.println(f1.getName());
		System.out.println(f1.getModifiers());
		System.out.println(f1.getType().getName());
		

	}

}
