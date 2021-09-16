package day28;

import java.util.HashMap;
import java.util.Map;



public class Station  implements Runnable{

	
	private Integer ticket = 5;//每个线程的票数
	private static final ThreadLocal<Integer> local=new ThreadLocal<>();

	
	public Integer getTicket() {
		
		if(local.get()==null) {
			System.out.println("是给："+Thread.currentThread().getName()+" 设置值的");
			local.set(ticket);//复制ticket的一个副本到当前线程中
		}
		
		
		System.out.println("是从："+Thread.currentThread().getName()+" 获取值的");
		
		return local.get();//从当前线程中获取数据
	}
	
	@Override
	public void run() {
		
		

		while(true) {
		Integer count=this.getTicket();
		if (count > 0) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + (count--));
			local.set(count);
			
		}else {
			
			break;
		}
		
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Station s = new Station();
		
		
	
		
		Thread t1=new Thread(s,"窗口1");
		Thread t2=new Thread(s,"窗口2");
		Thread t3=new Thread(s,"窗口3");
		Thread t4=new Thread(s,"窗口4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
	
		local.set(100);
		
		System.out.println(Thread.currentThread().getName()+local.get());

		
		
		
		
	}

}
