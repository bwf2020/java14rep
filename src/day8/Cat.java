package day8;

public class Cat extends Animal implements IAction{

	@Override
	public void eat(String name) {
		this.name=name;
		System.out.println(this.name+":猫在吃饭");
		
	}

	@Override
	public void sleep(String name) {
		this.name=name;
		System.out.println(this.name+":猫在睡觉");
		
	}

	
	
}
