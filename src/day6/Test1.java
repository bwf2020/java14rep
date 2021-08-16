package day6;

public class Test1 {

	public static void main(String[] args) {


		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.sex);
		System.out.println(p1.age);
		
		p1.eat();
		float score=p1.study(80);
		System.out.println("学习之后分数："+score);
		
		Person p2=new Person();
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1==p2);
		
		System.out.println(p2.name);
		System.out.println(p2.sex);
		System.out.println(p2.age);
		
		p2.name="李四";
		p2.sex='女';
		p2.age=22;
		
		p2.eat();
		p1.eat();
		
		System.out.println("=============");
		
		Dog d1=new Dog();
		System.out.println(d1);
		
		System.out.println(d1.id);
		System.out.println(d1.name);
		
		
		

	}

}
