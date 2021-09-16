package day28;

public class Test1 {

	public static void main(String[] args) {

		
		Counter c=new Counter();

		Thread t1=new Thread(()-> {
			
			c.show1();
		});
		

		Thread t2=new Thread(()-> {
			
			c.show2();
		});
		
		t1.start();
		
		t2.start();
		
	}

}
