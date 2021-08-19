package day9;

public class Test8 {

	public static void main(String[] args) {


		Color c1=Color.BLUE;
		
		System.out.println(c1);
		
		c1=Color.RED;
		System.out.println(c1);
		
		switch (c1) {
		case BLUE:
			System.out.println("蓝色");
			break;
		case RED:
			System.out.println("红色");
			break;
		case GREEN:
			System.out.println("绿色");
			break;
		default:
			break;
		}
		
		if(c1==Color.BLUE) {
			System.out.println("蓝色2");
			
		}else if(c1==Color.RED) {
			System.out.println("红色2");
			
		}else {
			
			System.out.println("绿色2");
		}
		
		

	}

}
