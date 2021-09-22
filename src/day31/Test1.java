package day31;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws  Exception {


		//获取字段
		
		
		Class c1= Child.class;
		
		Field[] fs= c1.getFields();
		
		System.out.println(fs.length);
		
		for (Field field : fs) {
			
			System.out.println(field.getName());
		}
		
		
		 fs= c1.getDeclaredFields();
		 System.out.println(fs.length);
		 

		for (Field field : fs) {
				
				System.out.println(field.getName());
		}
		
		System.out.println("=================");
		
		Method[] ms=  c1.getMethods();
		System.out.println(ms.length);
		 
		for (Method method : ms) {
			System.out.println(method.getName());
		}
		
		ms=  c1.getDeclaredMethods();
		System.out.println(ms.length);
		 
		for (Method method : ms) {
			System.out.println(method.getName());
		}
		
		
		System.out.println("==========");
		
		Method m1= c1.getDeclaredMethod("show4");
		System.out.println(m1.getModifiers());
		System.out.println(m1.getReturnType().getName());
		System.out.println(m1.getParameterCount());
		
		System.out.println(m1.getParameters());
		
		m1= c1.getDeclaredMethod("show4",Integer.class);//装箱机制
		
		System.out.println(m1.getParameterCount());
		
		m1= c1.getDeclaredMethod("show4",int.class,String.class);//装箱机制
		
		System.out.println(m1.getParameterCount());
		
		System.out.println("====================");
		
		
		 m1= c1.getDeclaredMethod("show3");
		 m1.setAccessible(true);
		 
		 Child c=new Child();
		 
		 Object rt= m1.invoke(c);
		 System.out.println(rt);
		 
		/* Scanner sc=new Scanner(System.in);
		 System.out.println("请输入要调用的函数名字");*/
		 
		 m1= c1.getDeclaredMethod("show4");
		 m1.setAccessible(true);
		 
		 rt= m1.invoke(c);
		 System.out.println(rt);
		 
		 rt=c.show4();
		 System.out.println(rt);
		 
		 m1= c1.getDeclaredMethod("show4",int.class);
		 m1.invoke(c, 100);
		 
		 m1= c1.getDeclaredMethod("show4",int.class,String.class);
		 m1.invoke(c, 100,"bwf");
		 
		 System.out.println("=============");
		 
		 Constructor[] cs= c1.getConstructors();
		 System.out.println(cs.length);
		 
		 cs= c1.getDeclaredConstructors();
		 System.out.println(cs.length);
		 
		 System.out.println(cs[0].getName());
		 System.out.println(cs[0].getParameterCount());
	
		 
		 cs= c1.getConstructors();
		 System.out.println(cs.length);
		 
		 cs= c1.getDeclaredConstructors();
		 System.out.println("=============");
		 for (Constructor cc : cs) {
			
			 System.out.println(cc.getName());
			 System.out.println(cc.getParameterCount());
			 for (Class p : cc.getParameterTypes()) {
				System.out.println(p.getName());
			}
			
		}
		 
		 
		 System.out.println("==========");
		 
		 Constructor cint= c1.getDeclaredConstructor(int.class);
		 cint.setAccessible(true);
		 System.out.println(cint.newInstance(100));
		 
		 cint= c1.getDeclaredConstructor(String.class);
		 System.out.println(cint.newInstance("zhangsan"));
		 
		 cint= c1.getDeclaredConstructor(String.class,int.class);
		 System.out.println(cint.newInstance("zhangsan",200));
		 
		 
		 cint= c1.getDeclaredConstructor();
		 System.out.println(cint.newInstance());
		 
		 Object obj=cint.newInstance();
		 System.out.println(obj.getClass().getMethod("show4", int.class).invoke(obj, 300));
		 
		 
		 
		 
		 
	}

}
