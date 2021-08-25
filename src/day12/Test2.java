package day12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2 {
	
	
	

	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		
		return true;
	}


	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "bwf";
	}



	public static void main(String[] args) {


		
		Test2 t=new Test2();
		System.out.println(t);
		
		System.out.println(t.hashCode());
		System.out.println(Integer.toHexString(t.hashCode()));
		
		Test2 t2=new Test2();
		
		System.out.println(t2.hashCode());
		
		System.out.println(t.equals(t2));
		System.out.println(t==t2);
		
		Set set=new HashSet();
		set.add(t);
		set.add(t2);
		
		System.out.println(set.size());
		
		System.out.println(t);
		System.out.println(t2);
		
		System.out.println("===========");
		
		String s1=new String("bwf");
		
		System.out.println(s1);
		
		
		
		

	}

}
