package day6;

public class Test2 {

	public static void main(String[] args) {


		Dog d1=new Dog();
		d1.id=300;
		d1.name="大黄";
		
	    System.out.println(d1);
	    
	    Dog d2=new Dog(500);
	    System.out.println(d2.id);
	    d2.id=600;
	    System.out.println(d2.id);
	    
	    Dog d3=new Dog(800);
	    System.out.println(d3.id);
	    System.out.println(d2.id);
	    System.out.println(d1.id);
	

	}

}
