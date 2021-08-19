package day9;

public class Test9 {

	public static void main(String[] args) {


		String s1="bwf";
		
		String s2=new String("bwf");
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		User u1=new User("zhangsan");
		
		User u2=new User("lisi");
		
		
		System.out.println(u1);
		System.out.println(u2);
		
		Object u3=new User("wangwu");
		
		System.out.println(u3);
		
		System.out.println("==============");
		
		
		System.out.println(s1==s2);
		System.out.println(u1==u2);
		
		System.out.println(s1.equals(s2));
		System.out.println(u1.equals(u2));

	}

}
