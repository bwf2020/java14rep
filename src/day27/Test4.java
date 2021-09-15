package day27;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test4 implements Runnable{

	
	//共享数据 堆
  volatile	int count=100;
  
  private Lock lock=new ReentrantLock();
	
	//private Object look=new Object();
	
	@Override
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName()+":进来了");
		//栈中的
		//int count=100;
		
		
		lock.lock();
		while(count>0) {
			
		
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+"：等到时间分片");
			
		/*	synchronized (look) {
				
					if(count>0) {
						System.out.println(Thread.currentThread().getName()+"-"+count--);
					}

					
				}*/
			
			//getCount();
			
			
			
			/*try {
				lock.tryLock(10,TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			*/
			if(count>0) {
				
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					System.out.println(Thread.currentThread().getName()+"-"+count--);
				
			}
			
			
			
			
			

		System.out.println(Thread.currentThread().getName()+":结束了");
			
			
		}
		
		lock.unlock();

	}
	
	
	public synchronized  void getCount() {
		
		if(count>0) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+"-"+count--);
		}
		
	}

	public static void main(String[] args) {

		//一个对象
		Test4 target=new Test4();
		

		Thread t1=new Thread(target);
		t1.setName("窗口1");
		t1.start();
		
		Thread t2=new Thread(target);
		t2.setName("窗口2");
		t2.start();
		
		Thread t3=new Thread(target);
		t3.setName("窗口3");
		t3.start();
		
		Thread t4=new Thread(target);
		t4.setName("窗口4");
		t4.start();
		
		Thread t5=new Thread(target);
		t5.setName("窗口5");
		t5.start();
		

	}

}
