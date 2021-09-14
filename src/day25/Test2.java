package day25;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
	
	
	
	static int count=1;

	public static void main(String[] args) {


		
		
		Stream<String> s=Stream.of("zhangsan","lisi","wangwu","zhaoliu");
		
		
		//s.forEach(System.out::println);
		
		/*s.forEach((str)->{
			
			System.out.println(str);
		});*/
		
		s.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				

				System.out.println(t);

				
			}
		
		
		});
		
		System.out.println("============");
		
		List list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Stream s2= list.stream();
		s2.forEach(System.out::println);
		
		
		int[] array= {1,5,78,63,99,12};
		IntStream s3= Arrays.stream(array);
		
		s3.forEach(System.out::println);
		
		
		System.out.println("========");

		String[] array2= {"a","b","c"};
		
		Stream s4= Arrays.stream(array2);
		s4.forEach(System.out::println);
		
		System.out.println("========");
		
		Stream s5=Stream.iterate(0,(n)->n+1);
		
		System.out.println(s5);
		
		s5=s5.limit(50);
		
		s5.forEach(System.out::println);
		
		
		System.out.println("========");
		
	/*	Stream s6= Stream.generate(new Supplier<Integer>() {

			
			int n=1;
			@Override
			public Integer get() {
				
				return n++;
			}
			
		});
		
		s6.forEach(System.out::println);*/
	
		

		Stream s6= Stream.generate(()->{
			
			return count++;
		});
		
		s6=s6.limit(30);
		s6.forEach(System.out::println);
		
		System.out.println("===========");
		
		Stream<Integer> s7=Stream.of(1,2,3,4,5,6,7,8);
		
		s7=s7.map((n)->n*2);
		
		//s7.forEach(System.out::println);
		
		
		s7=s7.filter((n)->n>=10);
		
		s7.forEach(System.out::println);
		

	}

}
