package day27;

public class Test6 {

	public static void main(String[] args) throws  Exception {


		Counter c1 = new Counter();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				c1.add(10);
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				c1.sub(10);
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c1.get());

	}

}
