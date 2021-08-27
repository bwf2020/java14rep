package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Test5 {

	public static void main(String[] args) throws  Exception {


		File file=new File("C:\\myfiles\\a.txt");
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
		
		
		/*raf.seek(10);
		raf.write(101);*/
		
		
		/*raf.seek(3);
		raf.write(68);*/
		
		
		/*raf.writeInt(100);
		raf.writeInt(101);*/
		
		/*raf.writeChar(100);
		raf.writeChar(101);*/
		
		//raf.writeChar(102);
		
		//raf.writeChars("bwf");
		
	/*	raf.writeInt(20);//写入4个字节
		raf.writeUTF("中国");//写入8个字节，前2个字节是长度，后面6个字节是数据
		raf.writeChars("中国");//写入2个字符，4个字节
		raf.writeFloat(3.2F);//写入4个字节
		*/
	
	
		System.out.println(raf.readInt());
		
		//raf.seek(4);
		
		//raf.skipBytes(4);
		
		System.out.println(raf.readUTF());
		
		System.out.println(raf.getFilePointer());
		
		System.out.println(raf.readChar());
		
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readChar());
		
		System.out.println(raf.readFloat());
		System.out.println(raf.getFilePointer());
		
	/*	raf.skipBytes(4);
		raf.writeInt(98);*/
	

	
		
	}

}
