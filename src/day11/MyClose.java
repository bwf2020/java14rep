package day11;

import java.io.Closeable;
import java.io.IOException;

public class MyClose implements Closeable {

	
	
	public void show1() {
		
		System.out.println("做一些事情");
	}
	
	
	@Override
	public void close() throws IOException {


		System.out.println("关闭资源");

	}

}
