package day26;

public class Test7 extends Thread {

	private volatile boolean flag = false;

	public void setFlag() {

		flag = true;
	}

	@Override
	public void run() {

		for (int i = 0; i < 99999; i++) {

			System.out.println(Thread.currentThread().getName());

			// if(isInterrupted()) {
			if (flag) {

				System.out.println("子线程终止了");
				return;

			} else {

				try {

					Thread.sleep(200);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			System.out.println(i);

		}

	}

	/*
	 * public void run() {
	 * 
	 * for (int i = 0; i < 99999; i++) {
	 * 
	 * System.out.println(Thread.currentThread().getName());
	 * 
	 * 
	 * if(isInterrupted()) {
	 * 
	 * System.out.println("子线程终止了"); return; }else {
	 * 
	 * 
	 * System.out.println(i); }
	 * 
	 * }
	 * 
	 * System.out.println("还有代码"); }
	 */

	public static void main(String[] args) throws Exception {

		/*
		 * Thread t1=new Test7(); t1.start();
		 * 
		 * 
		 * Thread.sleep(5000); t1.interrupt();
		 */

		try {
			Test7 t = new Test7();
			t.start();
			System.out.println("main start");
			Thread.sleep(1000); // 主线程暂停1毫秒，让子线程多执行一会儿

			// if(t.getState().ordinal()==1) {
			// t.interrupt(); // 中断t线程
			// }

			t.setFlag();
			// 发出标志

			// t.join(); // 等待t线程结束
			System.out.println("main end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
