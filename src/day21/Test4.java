package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test4 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/java14";
		String user = "root";
		String password = "123456";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from user where id = ?";
		PreparedStatement pcmd = conn.prepareStatement(sql);
		pcmd.setInt(1, 5);
		

		ResultSet rs = pcmd.executeQuery();
		
		System.out.println(rs.next());
		
		//rs.next();	
		String name = rs.getString("name");
		System.out.println(name);
		
		
	}
		
	}