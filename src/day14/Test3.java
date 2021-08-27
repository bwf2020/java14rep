package day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test3 {

	public static void main(String[] args) throws  Exception {


		File f=new File("C:\\myfiles\\user.txt");
		
		InputStream in=new FileInputStream(f);
		
		ObjectInputStream oin=new ObjectInputStream(in);
		
		
	  Object obj=	oin.readObject();
	  
	  System.out.println(obj);
	  
	  User user=(User) obj;
	  
	  System.out.println(user.getId());
	  System.out.println(user.getName());
	  System.out.println(user.getSex());
		
		
	}

}
