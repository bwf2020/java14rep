package day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test4 {

	public static void main(String[] args) throws  Exception {


		long start=System.currentTimeMillis();
		
		File file=new File("D:\\YingshiDownload/a.mp4");
		File file2=new File("D:\\YingshiDownload/a2.mp4");
		InputStream in=new FileInputStream(file);
		OutputStream out=new FileOutputStream(file2);
		
		byte[] buff=new byte[8*1024*1024];
		
		int i=0;
		
		while((i=in.read(buff))!=-1) {
			
			out.write(buff);
			out.flush();
		}
		
		
		long end=System.currentTimeMillis();
		
		System.out.println("消耗："+(end-start)/1000);
		
		in.close();
		out.close();
		
		

	}

}
