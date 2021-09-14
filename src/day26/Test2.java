package day26;

public class Test2 extends Thread{
	

	static int count=0;
	
	
	
	@Override
	public void run() {
		while(count<9999) {
			
		System.out.println("运行子线程"+Thread.currentThread().getName());
		try {
			if(Thread.currentThread().getName().equals("线程1")) {
				Thread.sleep(9999999);
			}else {
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
		}
	}

	public static void main(String[] args) throws  Exception {
		
		
		Thread t1=new Test2();
		t1.setName("线程1");
		t1.start();
		
		
		Thread t2=new Test2();
		t2.setName("线程2");
		t2.start();
		
		

		while(true) {
			
		System.out.println(Thread.currentThread().getName());
		
		//得到时间分片
		Thread.sleep(500);
		count++;
		System.out.println(count);
		
		}

	}

}
