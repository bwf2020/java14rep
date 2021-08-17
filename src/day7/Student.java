package day7;

public class Student extends Person{

	
	
	public Student() {
		
		System.out.println("学生类无参构造函数");
		
	}

	public Student(int id,String name) {
		
		super(id, name);
		System.out.println("学生类带参构造函数");
		
	}

	public String studentCard;
	
	
	public void study() {
		
		System.out.println("学习");
	}
	
	
	
	
}
