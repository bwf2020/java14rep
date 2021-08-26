package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test3 {

	public static void main(String[] args) throws  Exception {


		
		File file=new File("c:/myfiles/a2.txt");
		
		OutputStream out=new FileOutputStream(file);
		
	/*	out.write(97);
		out.write(98);
		out.write(99);
		out.write(100);*/
		
		byte[] data= {'h','e','l','l','o'};
		

		//out.write(data);
		
	
		
		String str="hello bwf";
		
		out.write(str.getBytes());
	}

}
