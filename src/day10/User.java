package day10;

public class User extends Person{

	
	public void show1() {
	
		System.out.println("用户中的show1");
		
	}
	public static void show2() {
		
		System.out.println("用户中的show2");
		
	}
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("用户对象即将被收回............................");
	}
	
	
	
	
}
