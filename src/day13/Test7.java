package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test7 {

	public static void main(String[] args) throws  Exception {


		
		File file=new File("C:\\myfiles/a.txt");
		
		Reader reader=new FileReader(file);
		
		BufferedReader br=new BufferedReader(reader);
		String str="";
		while((str=br.readLine())!=null) {
			
			System.out.println(str);
			
			
		}
		
		
		file=new File("C:\\myfiles/a1.txt");
		Writer writer=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(writer);
		
		bw.write("hello");
		bw.newLine();
		bw.write("bwf");
		bw.newLine();
		bw.write("51tesitng");
		bw.newLine();
		//使用的是缓存输出流  写的时候要清空  8K 
		bw.flush();
		
		reader.close();
		writer.close();
		br.close();
		bw.close();
		
		
	}

}
