package day7;

public class Test5 {

	
	
	static int num2=0;
	
	//1+2+3+4+5
	public static void show(int i) {
		

		num2+=i;
		
		if(i==1) {
			
			return ;
			
		}else {
			
			show(--i);
			
		}
		
		
	}
	
	//1+2+3+4+5
	public static int add(int i) {
		
		if(i==1) {
			
			return 1;
			
		}else {
			
			int rt=add(i-1);
			int num=rt+i;
			return num;
		}
		
	}
	
	
	public static void main(String[] args) {


		/*show(5);
		
		
		int num=0;
		for(int i=1;i<=5;i++) {
			
			num+=i;
		}
		System.out.println(num);
		
		System.out.println(num2);*/
		
		int num=add(5);
		System.out.println(num);
		
	}

}
