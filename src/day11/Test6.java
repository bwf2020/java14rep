package day11;

import java.io.IOException;

public class Test6 {

	
	
	public static void main(String[] args) {
		
		
		
		/*MyClose myclose=new MyClose();
		
		try {
		
		myclose.show1();
		
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				myclose.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}*/
	
				
		try {
			
			try(MyClose myclose=new MyClose()){
				myclose.show1();
				
			}catch (Exception e) {
				
			}
			
		}catch (Exception e) {


		}
		
		
	}
	
	
}
