package day7;

public class Person extends Object{

	
	public int id=1;
	public String name="bwf";
	public char sex;
	public int age;
	
	public Person() {
		
		
		System.out.println("父类的无参构造函数");
		
	}
	
	public Person(int id,String name) {
		
		this.id=id;
		this.name=name;
		System.out.println("父类的带参构造函数"+id+name);
		
	}
	
	
	public void eat() {
		
		System.out.println("吃饭");
	}
	public void sleep() {
		
		System.out.println("睡觉");
	}
}
