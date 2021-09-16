package day28;

public class Counter {

	private Object lock1 = new Object();

	private Object lock2 = new Object();
	
	
	private Object lock=new Object();
	

	public void show1() {

		synchronized (lock1) {
			
			System.out.println(Thread.currentThread().getName()+":拿到了lock1");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock2) {
				
				System.out.println(Thread.currentThread().getName()+":拿到了lock2");

			}
			
			System.out.println(Thread.currentThread().getName()+"可以做事情了");

		}

	}

	public void show2() {

		synchronized (lock1) {
			
			System.out.println(Thread.currentThread().getName()+":拿到了lock2");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock2) {

				System.out.println(Thread.currentThread().getName()+":拿到了lock1");
			}

			
			System.out.println(Thread.currentThread().getName()+"可以做事情了");
			
		}

	}

}
