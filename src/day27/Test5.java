package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test5 implements Runnable{


	
	private static List list=new ArrayList();
	private static Vector list2=new Vector();
	
	
	@Override
	public void run() {


	    for (int i = 0; i < 2000; i++) {
		
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list.add(i);
			//list2.add(i);
			System.out.println(Thread.currentThread().getName()+"=>"+(i));
			

			
			
		}
	
	}
	
		

	public static void main(String[] args) throws  Exception {

		Test5 target=new Test5();
		
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		Thread t3=new Thread(target);
		Thread t4=new Thread(target);
		Thread t5=new Thread(target);
		

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		System.out.println("结果："+list.size());
		System.out.println("结果："+list2.size());
		

	}

}
