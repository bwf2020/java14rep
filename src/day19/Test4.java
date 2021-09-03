package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) throws  Exception {


		
		
		List<Connection> list=new ArrayList<Connection>();
		
		System.out.println(list);
		
		for (int i = 0; i < 100; i++) {
			
			Connection conn=DBHelp.getConn();
			
			//DBHelp.closeConn(conn);
		
			list.add(conn);
			
			
			
		}
	
	
		System.out.println(list.size());
		
		
		
		
		

	}

}
