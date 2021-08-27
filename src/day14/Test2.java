package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test2 {

	public static void main(String[] args) throws  Exception {


		User u=new User();
		u.setId(1);
		u.setName("bwf");
		
		
		File f=new File("C:\\myfiles\\user.txt");
		
		OutputStream out=new FileOutputStream(f);
		ObjectOutputStream oout=new ObjectOutputStream(out);
		oout.writeObject(u);
		
		
		

	}

}
