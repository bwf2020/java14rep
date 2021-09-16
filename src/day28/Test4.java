package day28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test4 extends Thread{

	
	static int index=0;
	
	@Override
	public void run() {


		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().activeCount());
		
		System.out.println(index);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws  Exception {


	/*	ExecutorService exe=Executors.newCachedThreadPool();
		
		
		exe.execute(new Test4());
		
		System.out.println(exe.isShutdown());
		
		
		exe.execute(new Test4());
		
		
		exe.execute(new Test4());
		
	
		System.out.println("结束");*/
		
		
		
		/*ExecutorService exe=Executors.newFixedThreadPool(100);
		
		for (int i = 0; i < 50; i++) {
			
			index = i;
			exe.execute(new Test4());
			
		}*/
		
		
		
	/*	exe.schedule(new Test4(), 1, TimeUnit.SECONDS);
		exe.schedule(new Test4(), 2, TimeUnit.SECONDS);
		exe.schedule(new Test4(), 3, TimeUnit.SECONDS);
		exe.schedule(new Test4(), 4, TimeUnit.SECONDS);*/
		
		/*ScheduledExecutorService exe=Executors.newScheduledThreadPool(10);
		
		
		exe.scheduleAtFixedRate(new Test4(), 0, 3, TimeUnit.SECONDS);
		*/
		

		
	   //1,3  一秒之后才执行，但是已经被关闭了
		/*Thread.sleep(5000);
		exe.shutdown();*/
		
		
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 6; i++) {
			
		    final int index = i;
		    singleThreadExecutor.execute(new Runnable() {
		        @Override
		        public void run() {
		            try {
		                System.out.println(index+":"+
		                		Thread.currentThread().getName());
		                Thread.sleep(2000);
		                System.out.println("睡醒了...........");
		            } catch (InterruptedException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		        }
		    });
		}

	}

}
