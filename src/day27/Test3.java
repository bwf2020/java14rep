package day27;

public class Test3 extends Thread{

	
	
	
	@Override
	public void run() {


		while(true) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("守护线程："+Thread.currentThread().getName());
			System.out.println("当前存活的线程数量："+Thread.currentThread().getThreadGroup().activeCount());
			
		}
		
	}

	public static void main(String[] args) {


		Thread t1=new Test3();
		t1.setDaemon(true);
		t1.start();
		
		
		for (int i = 0; i <10; i++) {
			Thread t=new MyThread();
			t.setName("线程-"+i);
			t.start();
		}
		

	}

}
