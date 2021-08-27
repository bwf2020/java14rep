package day14;
import java.util.Scanner;
import java.io.File;
public class Test1 {


	
	public static void main(String[] args) {
		
		
		File file=new File("C:/myfiles/c");
		
		
		del(file);
		
	}
	
	public static void del(File file) {
		
		
		if(file.isDirectory()) {
			
			File[] fs=file.listFiles();
			for (File file2 : fs) {
				if(file2.isDirectory()) {
					del(file2);
				}else {
					file2.delete();
				}
			}
			
			file.delete();
			
		}else {
			file.delete();
		}
		
		
		
	}
	
	

}
