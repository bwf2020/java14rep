package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test5 {

	public static void main(String[] args) throws Exception {


		
		File file=new File("C:\\myfiles/a.txt");
		
		Reader reader=new FileReader(file);
		
	
		char[] cbuf=new char[20];
		int num=reader.read(cbuf);
		
		for (char c : cbuf) {
			System.out.print(c);
		}
		
		System.out.println("");
		String str=new String(cbuf,0,num);
		
		System.out.println(str);
		

		
	}

}
