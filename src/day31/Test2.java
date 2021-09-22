package day31;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Properties;
import java.util.stream.Stream;

import day30.User;

@SuppressWarnings("all")
public class Test2 {

	
	public static void main(String[] args) throws  Exception {


	/*	UserServer2 userServer=new UserServer2();
		
		userServer.reg("bwf");*/
		
		
		Properties pro=new Properties();
		pro.load(Test2.class.getResourceAsStream("obj.properties"));
		
		Class c= Class.forName(pro.getProperty("userServer"));
		
		IUserService userServer= (IUserService) c.newInstance();
		
		System.out.println(userServer.reg());
		
	

		
	}

}
