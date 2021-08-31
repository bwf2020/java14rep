package day16;

import java.util.ArrayList;
import java.util.List;

public class Test3<T> {
	
	
	public void show1(T t) {
		
		
		
	}
	
	
	public void show2(List<T> list) {
		
		
		
	}
	
	public void show3(List<?> list) {
		
		
	}
	
	public void show4(List<? extends User> list) {
		
		
	}
	
	public void show5(List<? super User> list) {
		
		
	}
	

	public static void main(String[] args) {


		IA<String> a=new A<String>();
		
		a.show1("100");
		String s=a.show2();
		
		IA<User> a2=new A<User>();
		a2.show1(new User());
		User u=a2.show2();	
		
		System.out.println("===========");
		
		Test3<String> t=new Test3<>();
		
		t.show1("bwf");
		
		
		List<String> list=new ArrayList<String>();
		t.show2(list);
		
		
		t.show3(list);
		
		List<User> list2=new ArrayList<User>();
		
		t.show3(list2);
		
		t.show4(list2);
		
		List<Student> list3=new ArrayList<Student>();
		t.show4(list3);
		
		
		t.show5(list2);
		
		List<Object> list4=new ArrayList<Object>();
		t.show4(list3);
		t.show5(list4);

	}

}
