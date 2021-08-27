package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test4 {

	public static void main(String[] args) throws Exception {


		File file=new File("C:\\myfiles/a.txt");
		PrintWriter out=new PrintWriter(file);
		
		out.print(100);
		out.print("hello");

		
		out.append("51testing");
		
	
		
		out.write("zhangsan");
		out.write(100);
		
		
		out.flush();
		
		
	}

}
