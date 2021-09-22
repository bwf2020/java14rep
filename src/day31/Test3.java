
package day31;


@Anno1(value=1,a="bwf",b=20)
public class Test3 {

	
	@Anno1(value=2,a="zhangsan")
	public static void main(String[] args) {



	}
	
	@Anno1(value=3,a="lisi")
	public void show1(@Anno1(value=2,a="wangwu") int a) {
		
		@Anno1(value=5,a="zhaoliu")
		int b=100;
		
	}
	
	

}
