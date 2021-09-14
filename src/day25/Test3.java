package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import day24.Student;

public class Test3 {

	
	 static int count=0;
	 
	public static void main(String[] args) {


		Stream s1=Stream.of(3,1,5,7,6,4,9,8,2);
		
		//s1=s1.sorted();
		s1=s1.sorted((a,b)->{
			
			return (Integer)b-(Integer)a;
			
		});
		
		s1.forEach(System.out::print);
		
		System.out.println("============");
		
		Stream s2=Stream.of("a","","b","c","","","","d");
		
		s2=(Stream) s2.parallel();
		
		
		
		s2=s2.filter((s)->{
			
	
			boolean f=s.equals("");
			if(f) {
				
				count++;
				return true;
			}else {
				
				return false;
			}
			
			
		});
		
		s2.forEach(System.out::println);
		
		System.out.println(count);
		

		System.out.println("===============");
		
		
		List list=new ArrayList();
		for (int i = 0; i < 10; i++) {
			
			list.add(i);
			
		}
		
		
		long start=System.currentTimeMillis();
		
		
		Stream s5=list.parallelStream();
		//Stream s5=list.stream();
		
		s5=s5.filter((n)->{
			
			boolean f=((int)n%2==0);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f;
			
		});
		
		s5.forEach(System.out::println);
	
		long end=System.currentTimeMillis();
		
		System.out.println("总时间："+(end-start));
		
		System.out.println("=========");
		
		
		Stream s6=Stream.of("a","b","c","d");
		
		/*s6=s6.map((n)->{
			
			n=((String)n).toUpperCase();
					
			return n;
			
		});*/

		
	/*	List list6=new ArrayList();
		s6.forEach((n)->{
			
			
			list6.add(n);
			
			
			
		});
		
		System.out.println(list6);*/
		
		
		//List<String> list6= (List<String>) s6.collect(Collectors.toList());
		

	
		List filtered = Stream.of("a","b","c").map((n)->{
					
					n=((String)n).toUpperCase();
							
					return n;
					
				})
				.collect(Collectors.toList());
		
		
		System.out.println(filtered);
		
		System.out.println("================");
		
		List<String> names=new ArrayList();
		names.add("张三");
		names.add("李四");
		names.add("王五");
		
		
		Stream<String> s9=names.stream();
		
		List<Student> stu= (List<Student>) s9.map(Student::new).collect(Collectors.toList());
		
		System.out.println(stu);
		

	}

}
