package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelp {
	
	
	private static String url=null;
	private static String user=null;
	private static String password=null;
	
	
	static {
		
		Properties pro=new Properties();

		try {
			
			pro.load(DBHelp.class.getResourceAsStream("dbconfig.properties"));
			url=pro.getProperty("url");
			user=pro.getProperty("user");
			password=pro.getProperty("pwd");
			
			
			Class.forName(pro.getProperty("driverClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static Connection getConn() {
		
		Connection conn=null;
		try {
			
			conn=DriverManager.getConnection(url, user, password);
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("数据库连接不上");
		}
		
		return conn;
		
	}
	
	public static void closeConn(Connection conn) {
		
		
		try {
			
		if(conn!=null&&!conn.isClosed()) {
			
			conn.close();
			conn=null;
			
		}
		
		}catch (Exception e) {
			System.out.println("关闭连接处了问题");
		}
		
	}
	
	

}
