package day7;

public class Test2 {

	public static void main(String[] args) {


		int a=1;
		int b=2;
		int c=2;
		
		System.out.println(a==b);
		System.out.println(b==c);
		
		User u1=new User();
		u1.name="zhangsan";
		
		User u2=new User();
		u2.name="zhangsan";
		
		System.out.println(u1==u2);
		
		System.out.println(u1);
		System.out.println(u2);
		
		String s1=new String("bwf");
		
		String s2=new String("bwf");
		
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(s1.equals(s2));
		
		System.out.println(u1.equals(u2));
		
		
		System.out.println("==========");
		String s3="bwf";
		String s4="bwf";
		String s5=new String("bwf");
		
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		
		System.out.println("==========");
		String s6="b"+"wf";//编译阶段能识别
		String s7="bw"+"f";
		String s8="bwf";
		
		System.out.println(s6==s7);
		System.out.println(s6==s8);
		
		System.out.println("==========");
		
		String c0="b"+"wf";//编译阶段  虚拟机对它做了一个优化 
		String c1="b";
		String c2="wf";
		String s9=c1+c2;//运行阶段
		System.out.println(c0);
		System.out.println(s9);
		System.out.println(s9==c0);
		
		
		

	}

}
