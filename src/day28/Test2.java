package day28;

public class Test2 implements Runnable{

	
	private Object lock1=new Object();
	private int count=0;
	
	@Override
	public void run() {

		
		if(Thread.currentThread().getName().equals("a")) {
			
			
			synchronized (lock1) {//对象上面有一把锁，监视器锁
				
				while(true) {
					
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					count++;
					if(count==20) {
						
						try {
							//lock1.wait(5000);
							lock1.wait();
							System.out.println("等待结束....................................................");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
				
			
			}
			
			
		}else {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (lock1) {
				
				System.out.println(Thread.currentThread().getName());
				System.out.println("=============================================================");
				//通知
				lock1.notify();
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("线程b释放锁了..........................................");
			}
			
			
		}
		
		
		

		

		
	}

	public static void main(String[] args) {

		
		Test2 target=new Test2();
     
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		
		t1.setName("a");
		t2.setName("b");
		
		
		t1.start();
		t2.start();
		
		
		

	}

}
