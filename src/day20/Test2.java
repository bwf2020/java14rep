package day20;

import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) throws  Exception {

/*
		IUserService userService=new UserService1();
		
		userService.show();*/
		
		Properties pro=new Properties();
		pro.load(Test1.class.getResourceAsStream("obj.properties"));
		
		UserService3 userService= (UserService3) Class.forName(pro.getProperty("userService")).newInstance();
		
		userService.show();
		

	}

}
