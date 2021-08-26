package day13;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test1 {

	public static void main(String[] args) throws IOException {


		//整个项目的根路径
		System.out.println(System.getProperty("user.dir"));
		
		//手写的绝对路径
		System.out.println("C:\\java14期课\\java14");
		
		//bin根目录
		System.out.println(Test1.class.getResource("/"));
		
		//当前文件所在的目录 相对路径
		System.out.println(Test1.class.getResource(""));
		
		//默认项目的根路径
		System.out.println("");
		
		System.out.println("======================");
		
		
		//File f=new File("a.txt");
		//File f=new File("C:\\myfiles/a.txt");
		
		//String path=URLDecoder.decode(Test1.class.getResource("/").getPath());
	
		String path=URLDecoder.decode(Test1.class.getResource("").getPath());
		
		path="C:/myfiles/a2.txt";
		
		File f=new File(path);
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.exists());
		
		System.out.println("=================");
		
		System.out.println(f.isAbsolute());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
		System.out.println(f.length());
	
		
		File f2=new File("C:/myfiles/a3.txt");
		f.renameTo(f2);
		
		
		path="C:/myfiles/a3.txt";
		
		File f3=new File(path);
		f3.deleteOnExit();
		
		path="C:/myfiles/a1.txt";
		
		File f1=new File(path);
		
		System.out.println(f1.exists());
		
		f1.createNewFile();
		
		
		System.out.println("对目录的操作");
		
		
		path="C:/myfiles/a";
		
		File f4=new File(path);
		
		System.out.println(f4.isFile());
		System.out.println(f4.isDirectory());
		
		System.out.println(f4.length());
		
		System.out.println(f4.list().length);
		
		for (String name : f4.list()) {
			System.out.println(name);
		}
		
		File[] fs=f4.listFiles();
		for (File file : fs) {
			System.out.println(file);
			file.delete();
		}
		
		/*path="C:/myfiles/b";
		
		File f5=new File(path);
		
		System.out.println(f5.delete());*/
		
		System.out.println(f4.delete());
		
		
		path="C:/myfiles/b";
		
		File f5=new File(path);
		
		//f5.mkdir();
		
		File[] files=f5.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File f) {
				
				if(f.getName().contains("b")&&f.getName().endsWith(".txt")){
					
					
					return true;
				}
				return false;
			}
		});
		
		System.out.println(files.length);
		
		
		
		
	}

}
