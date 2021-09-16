package day28;

public class Test3 {

	public static void main(String[] args) {


		WareHouse wh=new WareHouse();
		
		
		Thread t1=new Thread(()-> {
			
			while (true) {// 不断生产
				
				wh.get();
				
			
				}
			
		}); 
		
		Thread t2=new Thread(()-> {
			
				while (true) {// 不断消费
				
				wh.put();
				
			
				}
			
		}); 
		
		t1.start();
		
		t2.start();
		
		

	}

}
