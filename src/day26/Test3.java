package day26;

public class Test3 implements Runnable{

	
	
	public static void main(String[] args) {
		
		
		Test3 test=new Test3();
		
		Thread t1=new Thread(test, "线程1");
	
		t1.start();
		
		Thread t2=new Thread(test, "线程2");
		
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		
		
	}

	@Override
	public void run() {


		while(true) {

			
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
}
