package day26;

public class Test1 {

	public static void main(String[] args) {


		IA a=new IA() {
			
			@Override
			public void m1() {

				System.out.println("m1 匿名内部类....");
				
			}

		};
		
		
		IA a1=()->{
			
			System.out.println("m1 lambada");
			
		};
		
		
		
		a.m1();
		a.m2();
		IA.m3();
		
		a1.m1();
		a1.m2();

	}

}
