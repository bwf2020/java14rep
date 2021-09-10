package day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(3);

		System.out.println(list);

		/*
		 * Collections.sort(list,new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) {
		 * 
		 * 
		 * return o2-o1; }
		 * 
		 * 
		 * });
		 */

		Collections.sort(list, (Integer o1, Integer o2) -> {

			return o2 - o1;

		});

		System.out.println(list);

		System.out.println("==============");

		Test2 t2 = new Test2();
		t2.show2(new IA() {

			@Override
			public void m1() {

				System.out.println("ia接口中的m1方法匿名内部类实现");
			}
		});

		t2.show2(() -> {

			System.out.println("ia接口中m1方法lambda实现");

		});

		System.out.println("==============");

		t2.show3((String a) -> {

			System.out.println(a);

		});

		t2.show3((a) -> {

			System.out.println(a);

		});

		System.out.println("==========");

		IB b0 = new B();
		b0.m1("wangwu");

		IB b1 = new IB() {

			@Override
			public void m1(String a) {

				System.out.println("匿名内部类" + a);

			}
		};

		b1.m1("zhangsan");

		IB b2 = (a) -> {

			System.out.println("lambda方式" + a);
		};

		b2.m1("lisi");

		IB b3 = a -> {

			System.out.println("lambda方式" + a);
		};

		b3.m1("aa");

		IC c1 = (a, b) -> a + b;
		;

		System.out.println(c1.m1(1, 2));

		System.out.println("===============");

		Collections.sort(list, ID::m5);

		System.out.println(list);

		System.out.println("===============");

		list = new ArrayList();
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");

		Collections.sort(list, String::compareTo);

		/*
		 * Collections.sort(list,(String a,String b)->{
		 * 
		 * 
		 * return b.compareTo(a);
		 * 
		 * });
		 */

		System.out.println(list);

		System.out.println("======");

		List<String> list2 = new ArrayList();
		list2.add("zhangsan");
		list2.add("lisi");
		list2.add("wangwu");

		List<Student> student = list2.stream().map(Student::new).collect(Collectors.toList());

		System.out.println(student);
	}

	public void show2(IA a) {

		a.m1();

	}

	public void show3(IB b) {

		b.m1("bwf");

	}

}

class B implements IB {

	@Override
	public void m1(String a) {

		System.out.println("外部定义的类" + a);

	}

}
