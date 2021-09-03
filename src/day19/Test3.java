package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Test3 {
	

	public static void main(String[] args) throws  Exception {


		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/java14";
		String user="root";
		String password="123456";
		
		Connection conn=DriverManager.getConnection(url, user, password);
		
		String sql=" select * from user where id=? ";
		PreparedStatement pcmd=conn.prepareStatement(sql);
		pcmd.setInt(1, 5);
		
		ResultSet rs= pcmd.executeQuery();
		
		//System.out.println(rs.next());
		
		rs.next();
		String name= rs.getString(2);
		
		System.out.println(name);
		
		//System.out.println(rs.next());
		
	/*	name= rs.getString(2);
		
		System.out.println(name);*/
		
		
		String sex= rs.getString("sex");
		
		System.out.println(sex);
		
		String score= rs.getString("score");
		
		System.out.println(score);
		
		System.out.println("=================");
		
		
		sql=" select * from user where 1=1 ";
		pcmd=conn.prepareStatement(sql);
		rs= pcmd.executeQuery();
		
		Date birthday;
		Date startDate;

		while(rs.next()) {
			
			name=rs.getString("name");
			sex=rs.getString("sex");
			birthday=rs.getTimestamp("birthday");
			startDate=rs.getTimestamp("startdate");
	
			System.out.println(name+"-"+sex+"-"+birthday+"-"+startDate);
		}
		
		
		
		

	}

}
