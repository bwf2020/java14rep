package day8;

public class Dog extends Animal implements IAction{

	@Override
	public void eat(String name) {
		this.name=name;
		System.out.println(this.name+":狗在吃饭");
	}

	@Override
	public void sleep(String name) {
		this.name=name;
		System.out.println(this.name+":狗在睡觉");
		
	}

	
	
	
}
