package day13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test2 {

	public static void main(String[] args) throws Exception {


		
		
		File file=new File("C:\\myfiles/a.txt");
		
		InputStream in=new FileInputStream(file);
		
		System.out.println(in);
		
		//读取这个文件中的内容了
		
	/*	System.out.print((char)in.read());
		System.out.print((char)in.read());
		System.out.print((char)in.read());
		System.out.print((char)in.read());
		System.out.print((char)in.read());
		
		System.out.print(in.read());*/
		int c=' ';
		while((c=in.read())!=-1) {
			
			System.out.print((char)c);
		}
		
		System.out.println("");
		System.out.println("====");
		
		file=new File("C:\\myfiles/a.txt");
		
		in=new FileInputStream(file);
		byte[] b=new byte[3];
		int i=0;
		StringBuffer sb=new StringBuffer();
		
		
		while((i=in.read(b))!=-1) {
			
			for (byte d : b) {
				sb.append((char)d);
			}
			
		
		}
		
		System.out.println(sb.toString());
		
		System.out.println("");
		
		
		System.out.println("====");
		
		file=new File("C:\\myfiles/a.txt");
		
		in=new FileInputStream(file);
		byte[] b2=new byte[3];
		int i2=0;
	
		
		while((i2=in.read(b2))!=-1) {
			
			System.out.print(new String(b2,0,i2));
		}
		
	
		
		System.out.println("");
		
		System.out.println("============");
		
		file=new File("C:\\myfiles/a.txt");
		
		in=new FileInputStream(file);
		
		byte[] buffer=new byte[3];//定义一个缓冲数组
		int length=in.read(buffer);//读取第1次
		while(length!=-1){//判断是否读到文件尾
			//先处理上次读取的数据
			System.out.print(new String(buffer,0,length));
			
			length=in.read(buffer);//再读下一次
		
		}
		
		
		in.close();

	}

}
