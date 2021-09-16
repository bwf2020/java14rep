package day28;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WareHouse {
	
	private int count=0;
	
	/*private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();*/
	
	
	public synchronized void put() {
	
		
		
		//lock.lock();
	
		if (count>=5) {// 商品超过5个等待
			try {
				wait();
				//condition.await();
				System.out.println("继续生产");
			} catch (Exception e) {
			} // 进入等待池
		}
		
		count++;
		
		System.out.println("生产后还有："+count);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		notify();//唤醒对方的，不是说得到时间分片，只是有权利争夺锁
		
		//condition.signal();
		
		//lock.unlock();
		
	}
	
	
	public synchronized  void get() {
		
		
		//lock.lock();
		
		if (count==0) {// 判断当前是否有产品可以消费
			try {
				wait();
				//condition.await();
				System.out.println("继续下消费");
			} catch (Exception e) {
			} // 进入等待池
		}
		
		
		count--;
		System.out.println("消费后还有："+count);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		notify();
		try {
			Thread.sleep(999999);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//condition.signal();
		//lock.unlock();
		
	}

}
