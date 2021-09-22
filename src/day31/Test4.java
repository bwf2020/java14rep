package day31;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@AnnoType(a=100)
public class Test4 {
	
	@AnnoMethod(b="bwf")
	public void show1(@AnnoParam String a,@AnnoParam(c="zhangsan") String b) {
		
		System.out.println("show1");
	}

	
	
	public static void main(String[] args) throws  Exception {


		
		Class c=Test4.class;
		
		Annotation[] ats= c.getAnnotations();
		System.out.println(ats.length);
		
		AnnoType a1=(AnnoType) ats[0];
		
		System.out.println(a1);
		
		System.out.println(a1.a());
		
		Method m= c.getDeclaredMethod("show1", String.class,String.class);
		AnnoMethod a2= m.getAnnotation(AnnoMethod.class);
		
		System.out.println(a2.b());
		
		Parameter p1= m.getParameters()[0];
		Parameter p2= m.getParameters()[1];
		
		AnnoParam a3= p1.getDeclaredAnnotation(AnnoParam.class);
		System.out.println(a3.c());
		
		AnnoParam a4= p2.getDeclaredAnnotation(AnnoParam.class);
		System.out.println(a4.c());
		
		
		
		
	}

}
