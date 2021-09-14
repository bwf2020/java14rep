package day26;

public class Test5 implements Runnable{

	
	static int sum=0;
	
	@Override
	public void run() {

	
		for (int i = 0; i < 10; i++) {
			
			
			if(i%2==0) {
				
				sum+=i;
			}
			
			System.out.println("子线程："+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	

	public static void main(String[] args) throws  Exception {


		Test5 test=new Test5();
		
		Thread t=new Thread(test,"线程1");
		
		t.start();
		
		t.join();
		
		
		//Thread.sleep(10000);
		System.out.println("当前线程："+Thread.currentThread().getName());	
		System.out.println("总和："+sum);

	}


}
