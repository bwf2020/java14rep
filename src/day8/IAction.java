package day8;

public interface IAction {

	
	public default void huxi(String name) {

		System.out.println(name+"呼吸");
	}
	
	public void eat(String name);
	
	public void sleep(String name);
	
	
	
	
}
