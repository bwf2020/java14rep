package day9;

public class Test4 extends C{

	
	
	public void show1(int a) {
		
		System.out.println("test4 show1");
	}
	
	
	public void show2(int a) {
		
		
		System.out.println("test4 show2");
		
	}
	

	@Override
	public int show3() {
	
		
		return 2;
	}
	
	


	@Override
	public String show4() {
	
		return "bwf";
		
	}
	
	


	@Override
	public void show5() {

		
	}


	public static void main(String[] args) {


		Test4 t=new Test4();
		t.show1();
		t.show1(10);
		
		System.out.println("=========");
		
		t.show2(100);
		
	}

}
