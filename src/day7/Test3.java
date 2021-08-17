package day7;

public class Test3 {

	public static void main(String[] args) {


		Student s=new Student();
		s.id=1;
		s.name="zhangsan";
		s.age=20;
		
		System.out.println(s.name);
		s.eat();
		s.sleep();
		s.study();
		

		Teacher t=new Teacher();
		t.id=1;
		t.name="bwf";
		t.age=18;
		
		System.out.println(t.name);
		
		t.eat();
		t.sleep();
		t.jiaoXue();
		
		
		

	}

}
