package day27;

public class Test2 extends Thread{

	
	
	
	@Override
	public void run() {

		while (true) {
			
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

	public static void main(String[] args) {

		

		for (int i = 0; i < 9999; i++) {
			
			Thread t=new Test2();
			t.start();
			
		}

	}

}
