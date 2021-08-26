package a.b;

import day13.Test1;

public class Test2 {

	public static void main(String[] args) {
		//整个项目的根路径
		System.out.println(System.getProperty("user.dir"));
		
		//手写的绝对路径
		System.out.println("C:\\java14期课\\java14");
		
		//bin根目录
		System.out.println(Test2.class.getResource("/"));
		
		//当前文件所在的目录 相对路径
		System.out.println(Test2.class.getResource(""));

	}

}
