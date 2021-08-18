package day8;

public class C2 implements IC2 {

	@Override
	public void show1() {
		System.out.println("c2 show1");

	}

	@Override
	public void show5() {
		System.out.println("c2 show5");

	}

	@Override
	public void show2() {
	
		
		System.out.println("c2 show2");
		
	}

	@Override
	public void show4() {
		
		System.out.println("c2 show4");
		IC2.super.show4();
		
	}
	
	
	
	

}
