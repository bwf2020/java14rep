package day6;

public class Person {
	
	public String name="zhangsan";
	public int age=18;
	public char sex='男';
	
	public void eat() {
		
		
		System.out.println(name+":吃饭");
		
	}
	
	public float study(int score) {
		
		System.out.println(name+":学习");
		return (float) (score*1.5);
	}

}
