package day10;

public class Test3 {

	
	public static void main(String[] args) {
		
		
		//这个A类 特点，只要在这里用一次，别的地方都不需要
	/*	IA a3=new A();
		
		a3.show1();*/
		
		IA a=new IA() {
			
			@Override
			public void show1() {

					System.out.println("匿名内部类show1");
				
			}
		};
		
		IA a2=new IA() {
			
			@Override
			public void show1() {

					System.out.println("匿名内部类show12");
				
			}
		};
		
		
		a.show1();
		a2.show1();
	}
}
