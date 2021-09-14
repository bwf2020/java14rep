package day25;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;



public class Test1 {
	
	private static  Stream<Integer> createNaturalStream(){
	    Stream<Integer> naturals = Stream.of(1,2,3,4,5,6,7,8,9,10);
	    return naturals;
	}

	

	public static void main(String[] args) {


		Stream<Integer> s=createNaturalStream();
		
		System.out.println(s);
		
		Stream<Integer> s2=s.limit(5);
		
		System.out.println(s2);
		
		/*s2.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {

					System.out.println(t);
				
			}
			
		});*/
		
		/*System.out.println("============");
		s2.forEach((num)->{
			
			
			System.out.println(num);
			
		});*/
		
		System.out.println("============");
		
		s2.forEach(System.out::println);
		
		
		
		

	}

}
