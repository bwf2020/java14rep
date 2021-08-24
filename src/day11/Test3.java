package day11;

public class Test3 {
	
	public static void show1() {
		
		
		
		try {
			
			
			System.out.println(1);
			
			System.out.println(1/0);
			
			System.out.println(4);
			
			return;
			
			
			
		}catch (Exception e) {
			
			System.out.println(2);
			
		}finally {
			System.out.println(3);
		}
		
	}
	
	
	public static int show2() {
		
		
		try {
			
			
			System.out.println("try");
			System.out.println(1/0);
			return 1;
			
		}catch (Exception e) {
			System.out.println("catch");
			return 2;
		}finally {
			System.out.println("finally");
			return 3;
		}
		
	}

	public static void main(String[] args) {


		
		show1();
		System.out.println("==========");
		System.out.println(show2());
		

	}

}
